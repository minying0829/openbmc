FILESEXTRAPATHS:prepend:scm-npcm845 := "${THISDIR}/${PN}:"

SRC_URI:append:scm-npcm845 = " \
    file://0001-hwmon-temp-add-tmp100-support.patch \
    file://0002-Fansensor-get-pwm-from-other-hwmon-path.patch \
    file://0003-psu-sensor-add-fan3-support.patch \
    file://0004-psu-sensor-support-p2011-psu.patch \
    file://0005-hwmontemp-add-adm-stbsi-support.patch \
    file://0006-add-dimm-sensor.patch \
    file://0007-add-nic-temp-sensor.patch \
    file://0008-increase-adc-max-reading.patch \
    file://0009-change-psu-sensor-name.patch \
    file://0010-add-sesnor-max16550.patch \
    file://xyz.openbmc_project.dimmsensor.service \
    "

PACKAGECONFIG:scm-npcm845 = "\
    hwmontempsensor \
    fansensor \
    psusensor \
    adcsensor \
    intrusionsensor \
    nvmesensor \
    dimmsensor \
    mcutempsensor \
    "

PACKAGECONFIG[dimmsensor] = "-Ddimm=enabled, -Ddimm=disabled"
SYSTEMD_SERVICE:${PN}:append:scm-npcm845 = "${@bb.utils.contains('PACKAGECONFIG', 'dimmsensor', \
                                               ' xyz.openbmc_project.dimmsensor.service', \
                                               '', d)}"

SYSTEMD_SERVICE:${PN} += "xyz.openbmc_project.nvmesensor.service"

do_install:append:scm-npcm845() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/xyz.openbmc_project.dimmsensor.service \
        ${D}${systemd_system_unitdir}
}

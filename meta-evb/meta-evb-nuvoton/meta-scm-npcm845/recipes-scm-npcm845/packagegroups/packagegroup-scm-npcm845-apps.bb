SUMMARY = "OpenBMC for EVB NPCM845 system - Applications"
PR = "r1"

inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES = " \
        ${PN}-chassis \
        ${PN}-fans \
        ${PN}-flash \
        ${PN}-system \
        "
PROVIDES += "virtual/obmc-chassis-mgmt"
PROVIDES += "virtual/obmc-fan-mgmt"
PROVIDES += "virtual/obmc-flash-mgmt"
PROVIDES += "virtual/obmc-system-mgmt"

RPROVIDES:${PN}-chassis += "virtual-obmc-chassis-mgmt"
RPROVIDES:${PN}-fans += "virtual-obmc-fan-mgmt"
RPROVIDES:${PN}-flash += "virtual-obmc-flash-mgmt"
RPROVIDES:${PN}-system += "virtual-obmc-system-mgmt"

SUMMARY:${PN}-chassis = "EVB NPCM845 Chassis"
RDEPENDS:${PN}-chassis = " \
        x86-power-control \
        "

SUMMARY:${PN}-fans = "EVB NPCM845 Fans"
RDEPENDS:${PN}-fans = " \
        phosphor-pid-control \
        "

SUMMARY:${PN}-flash = "EVB NPCM845 Flash"
RDEPENDS:${PN}-flash = " \
        phosphor-ipmi-flash \
        "

SUMMARY:${PN}-system = "EVB NPCM845 System"
RDEPENDS:${PN}-system = " \
        webui-vue \
        obmc-ikvm \
        iperf3 \
        nmon \
        memtester \
        htop \
        ipmitool \
        nuvoton-ipmi-oem \
        openssl-bin \
        openssl-engines \
        phosphor-host-postd \
        phosphor-sel-logger \
        rsyslog \
        loadsvf \
        pciutils \
        cpfw \
        phosphor-ecc \
        i3c-tools \
        phosphor-ipmi-blobs \
        phosphor-image-signing \
        optee-client \
        optee-test \
	tcpdump \
	net-tools \
	ethtool \
	phytool \
        fan-init \
	phosphor-post-code-manager \
        "
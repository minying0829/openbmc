SUMMARY = "Meta-python ptest packagegroups"

inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES = ' \
    packagegroup-meta-python3 \
'

# Note that python3-cvxopt requires Fortran support. To enable this,
# add the following to your local.conf:
# FORTRAN:forcevariable = ",fortran"
RDEPENDS:packagegroup-meta-python3 = "\
    ${@bb.utils.contains("DISTRO_FEATURES", "systemd", "python3-systemd", "", d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11 systemd", "python3-blivetgui", "", d)} \
    gyp \
    ${@bb.utils.contains("DISTRO_FEATURES", "pam", "pamela", "", d)} \
    pyrtm \
    python3-absl \
    python3-aenum \
    python3-aiofiles \
    python3-aiohttp \
    python3-aiohttp-jinja2 \
    python3-aiohue \
    python3-aiosignal \
    python3-alembic \
    python3-ansi2html \
    python3-ansicolors \
    python3-appdirs \
    python3-apply-defaults \
    python3-argcomplete \
    python3-argexec \
    python3-argh \
    python3-arpeggio \
    python3-asciitree \
    python3-aspectlib \
    python3-astor \
    python3-astroid \
    python3-asttokens \
    python3-async-timeout \
    python3-asyncio-glib \
    python3-attr \
    python3-autobahn \
    python3-automat \
    python3-aws-iot-device-sdk-python \
    python3-backcall \
    python3-bandit \
    python3-beautifulsoup4 \
    python3-behave \
    python3-betamax \
    python3-bitarray \
    python3-bitstring \
    python3-bitstruct \
    python3-blinker \
    ${@bb.utils.contains("DISTRO_FEATURES", "systemd", "python3-blivet", "", d)} \
    python3-booleanpy \
    python3-cachecontrol \
    python3-cached-property \
    python3-cachetools \
    python3-can \
    python3-cantools \
    python3-cassandra-driver \
    python3-cbor2 \
    python3-cerberus \
    python3-chardet \
    python3-charset-normalizer \
    python3-cheetah \
    python3-click \
    python3-click-repl \
    python3-click-spinner \
    python3-cmd2 \
    python3-colorama \
    python3-coloredlogs \
    python3-colorlog \
    python3-colorzero \
    python3-configargparse \
    python3-configobj \
    python3-configshell-fb \
    python3-constantly \
    python3-contextlib2 \
    python3-coverage \
    python3-cppy \
    python3-crcmod \
    python3-croniter \
    python3-cson \
    python3-custom-inherit \
    ${@bb.utils.contains_any('FORTRAN', [',fortran',',f77'], 'python3-cvxopt', '', d)} \
    python3-cycler \
    python3-cytoolz \
    python3-dateparser \
    python3-dateutil \
    python3-dbus-next \
    python3-dbussy \
    python3-decorator \
    python3-decouple \
    python3-defusedxml \
    python3-dill \
    python3-diskcache \
    python3-distro \
    python3-django \
    python3-django-south \
    python3-djangorestframework \
    python3-dnspython \
    python3-docopt \
    python3-docutils \
    python3-dominate \
    python3-dynamic-dispatch \
    python3-ecdsa \
    python3-editables \
    python3-editor \
    python3-email-validator \
    python3-engineio \
    python3-et-xmlfile \
    python3-eth-abi \
    python3-eth-account \
    python3-eth-hash \
    python3-eth-keyfile \
    python3-eth-keys \
    python3-eth-rlp \
    python3-eth-typing \
    python3-eth-utils \
    python3-evdev \
    python3-execnet \
    python3-fann2 \
    python3-fasteners \
    python3-fastjsonschema \
    python3-fastnumbers \
    python3-fields \
    python3-flask \
    python3-flask-babel \
    python3-flask-bootstrap \
    python3-flask-jsonpify \
    python3-flask-jwt \
    python3-flask-login \
    python3-flask-mail \
    python3-flask-migrate \
    python3-flask-nav \
    python3-flask-pymongo \
    python3-flask-restful \
    python3-flask-sijax \
    python3-flask-socketio \
    python3-flask-sqlalchemy \
    python3-flask-uploads \
    python3-flask-user \
    python3-flask-versioned \
    python3-flask-wtf \
    python3-flask-xstatic \
    python3-future \
    python3-frozenlist \
    python3-gast \
    python3-gcovr \
    python3-geojson \
    python3-geomet \
    python3-gevent \
    python3-gmpy2 \
    python3-gmqtt \
    python3-gnupg \
    python3-google-api-python-client \
    python3-gpiod \
    python3-gpsd-py3 \
    python3-graphviz \
    python3-greenlet \
    python3-greenstalk \
    python3-grpcio \
    python3-grpcio-tools \
    python3-gsocketpool \
    python3-gunicorn \
    python3-h11 \
    python3-h2 \
    python3-h5py \
    python3-hatchling \
    python3-haversine \
    python3-hpack \
    python3-html2text \
    python3-html5lib \
    python3-httplib2 \
    python3-huey \
    python3-humanfriendly \
    python3-humanize \
    python3-hyperframe \
    python3-hyperlink \
    python3-icu \
    python3-idna \
    python3-idna \
    python3-idna-ssl \
    python3-ifaddr \
    python3-imageio \
    python3-imgtool \
    python3-incremental \
    python3-inflection \
    python3-inotify \
    python3-intelhex \
    python3-intervals \
    python3-ipaddress \
    python3-ipy \
    python3-ipython \
    python3-ipython-genutils \
    python3-iso3166 \
    python3-isodate \
    python3-isort \
    python3-itsdangerous \
    python3-javaobj-py3 \
    python3-jdatetime \
    python3-jdcal \
    python3-jedi \
    python3-jmespath \
    python3-joblib \
    python3-jsmin \
    python3-jsonpatch \
    python3-jsonpath-rw \
    python3-jsonpointer \
    python3-jsonref \
    python3-jsonschema \
    python3-jstyleson \
    python3-kconfiglib \
    python3-keras-applications \
    python3-keras-preprocessing \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11 opengl", "python3-kivy", "", d)} \
    python3-kiwisolver \
    python3-langtable \
    python3-lazy-object-proxy \
    python3-libconf \
    python3-license-expression \
    python3-ldap \
    python3-lockfile \
    python3-lorem \
    python3-lrparsing \
    python3-lru-dict \
    python3-luma-core \
    python3-luma-oled \
    python3-lxml \
    python3-lz4 \
    python3-m2crypto \
    python3-markupsafe \
    python3-matplotlib \
    python3-mccabe \
    python3-meh \
    python3-meld3 \
    python3-mock \
    python3-monotonic \
    python3-mpmath \
    python3-msgpack \
    python3-msk \
    python3-msm \
    python3-multidict \
    python3-mypy \
    python3-mypy-extensions \
    python3-natsort \
    python3-netaddr \
    python3-netifaces \
    python3-networkx \
    python3-nmap \
    python3-nocasedict \
    python3-nocaselist \
    python3-ntplib \
    python3-oauthlib \
    python3-obd \
    python3-openpyxl \
    python3-ordered-set \
    python3-padaos \
    python3-padatious \
    python3-paho-mqtt \
    python3-pako \
    python3-pandas \
    python3-parallax \
    python3-paramiko \
    python3-parse \
    python3-parse-type \
    python3-parsimonious \
    python3-parso \
    python3-passlib \
    python3-pastedeploy \
    python3-pathspec \
    python3-pathtools3 \
    python3-pep8 \
    python3-periphery \
    python3-petact \
    python3-pexpect \
    python3-pickleshare \
    python3-pid \
    python3-pika \
    python3-pillow \
    python3-pint \
    python3-pkcs11 \
    python3-pkgconfig \
    python3-pocketsphinx \
    python3-polyline \
    python3-portalocker \
    python3-posix-ipc \
    python3-prctl \
    python3-precise-runner \
    python3-prettytable \
    python3-priority \
    python3-process-tests \
    python3-progress \
    python3-prompt-toolkit \
    python3-protobuf \
    python3-ptyprocess \
    python3-pulsectl \
    python3-py-cpuinfo \
    python3-py-ubjson \
    python3-pyalsaaudio \
    python3-pyasn1-modules \
    python3-pyatspi \
    python3-pyaudio \
    python3-pybind11 \
    python3-pybind11-json \
    python3-pybluez \
    python3-pychromecast \
    python3-pycocotools \
    python3-pycodestyle \
    python3-pyconnman \
    python3-pycurl \
    python3-pydbus \
    python3-pydicti \
    python3-pyephem \
    python3-pyexpect \
    python3-pyfanotify \
    python3-pyfirmata \
    python3-pyflakes \
    python3-pyhamcrest \
    python3-pyiface \
    python3-pyjks \
    python3-pyjwt \
    python3-pykickstart \
    python3-pykwalify \
    python3-pylint \
    python3-pylyrics \
    python3-pymetno \
    python3-pymisp \
    python3-pymongo \
    python3-pymysql \
    python3-pynacl \
    python3-pynetlinux \
    python3-pyparted \
    python3-pyperclip \
    python3-pyperf \
    python3-pyrad \
    python3-pyro4 \
    python3-pyroute2 \
    python3-pyrsistent \
    python3-pyscaffold \
    python3-pyserial \
    python3-pysonos \
    ${@bb.utils.contains("DISTRO_FEATURES", "systemd", "python3-pystemd", "", d)} \
    python3-pytest-asyncio \
    python3-pytest-benchmark \
    python3-pytest-cache \
    python3-pytest-forked \
    python3-pytest-helpers-namespace \
    python3-pytest-html \
    python3-pytest-lazy-fixtures \
    python3-pytest-metadata \
    python3-pytest-tempdir \
    python3-pytest-timeout \
    python3-pytest-xdist \
    python3-pythonping \
    python3-python-vlc \
    python3-pytoml \
    python3-pytun \
    python3-pyudev \
    python3-pyusb \
    python3-pywbem \
    python3-pywbemtools \
    python3-pyyaml \
    python3-pyzmq \
    python3-qrcode \
    python3-raven \
    python3-rdflib \
    python3-redis \
    python3-regex \
    python3-requests-file \
    python3-requests-ftp \
    python3-requests-futures \
    python3-requests-oauthlib \
    python3-requests-toolbelt \
    python3-rfc3339-validator \
    python3-rfc3986-validator \
    python3-rfc3987 \
    python3-rlp \
    python3-robotframework \
    python3-robotframework-seriallibrary \
    python3-rsa \
    python3-ruamel-yaml \
    python3-scrypt \
    python3-sdnotify \
    python3-semver \
    python3-send2trash \
    python3-sentry-sdk \
    python3-serpent \
    python3-service-identity \
    python3-setuptools-declarative-requirements \
    python3-sh \
    python3-sijax \
    python3-simpleeval \
    python3-simplejson \
    python3-slip-dbus \
    python3-smbus \
    python3-smbus2 \
    python3-smpplib \
    python3-snappy \
    python3-socketio \
    python3-soupsieve \
    python3-speaklater \
    python3-speedtest-cli \
    python3-spidev \
    python3-spidev \
    python3-sqlalchemy \
    python3-sqlparse \
    python3-sqlsoup \
    python3-stevedore \
    python3-supervisor \
    python3-sympy \
    python3-tabulate \
    python3-term \
    python3-termcolor \
    python3-textparser \
    python3-texttable \
    python3-thrift \
    python3-tinyrecord \
    python3-tornado \
    python3-toolz \
    python3-tqdm \
    python3-trafaret \
    python3-trafaret-config \
    python3-traitlets \
    python3-transitions \
    python3-trustme \
    python3-twine \
    python3-twisted \
    python3-twitter \
    python3-twofish \
    python3-txaio \
    python3-txdbus \
    python3-txws \
    python3-typeguard \
    python3-tzlocal \
    python3-u-msgpack-python \
    python3-ujson \
    python3-unidiff \
    python3-uritemplate \
    python3-vcversioner \
    python3-versioneer \
    python3-versiontools \
    python3-visitor \
    python3-waitress \
    python3-watchdog \
    python3-watchdogdev \
    python3-web3 \
    python3-webcolors \
    python3-webencodings \
    python3-websocket-client \
    python3-websockets \
    python3-werkzeug \
    python3-werkzeug \
    python3-whoosh \
    python3-wrapt \
    python3-wtforms \
    python3-xlrd \
    python3-xlsxwriter \
    python3-xmltodict \
    python3-xmodem \
    python3-xstatic \
    python3-xstatic-font-awesome \
    python3-xxhash \
    python3-yamlloader \
    python3-yappi \
    python3-yarl \
    python3-zopeinterface \
    telepathy-python3 \
    unattended-upgrades \
"

RDEPENDS:packagegroup-meta-python3-ptest = "\
    python3-ansicolors-ptest \
    python3-appdirs-ptest \
    python3-betamax-ptest \
    python3-blinker-ptest \
    python3-cachetools-ptest \
    python3-cbor2-ptest \
    python3-click-ptest \
    python3-dnspython-ptest \
    python3-dominate-ptest \
    python3-geojson-ptest \
    python3-gunicorn-ptest \
    python3-hexbytes \
    python3-html2text-ptest \
    python3-inflection-ptest \
    python3-intervals-ptest \
    python3-ipy-ptest \
    python3-iso3166-ptest \
    python3-jdcal-ptest \
    python3-jinja2-ptest \
    python3-jsmin-ptest \
    python3-jsonpointer-ptest \
    python3-license-expression-ptest \
    python3-markupsafe-ptest \
    python3-msgpack-ptest \
    python3-multidict-ptest \
    python3-ordered-set-ptest \
    python3-parse-ptest \
    python3-parse-type-ptest \
    python3-pint-ptest \
    python3-polyline-ptest \
    python3-precise-runner-ptest \
    python3-prettytable-ptest \
    python3-ptyprocess-ptest \
    python3-pyasn1-modules-ptest \
    python3-pyroute2-ptest \
    python3-pyserial-ptest \
    python3-pytoml-ptest \
    python3-pyzmq-ptest \
    python3-requests-file-ptest \
    python3-requests-toolbelt-ptest \
    python3-scrypt-ptest \
    python3-semver-ptest \
    python3-serpent-ptest \
    python3-simpleeval-ptest \
    python3-smpplib-ptest \
    python3-soupsieve-ptest \
    python3-sqlparse-ptest \
    python3-typeguard-ptest \
    python3-ujson-ptest \
    python3-u-msgpack-python-ptest \
    python3-unidiff-ptest \
    python3-uritemplate-ptest \
    python3-webcolors-ptest \
    python3-whoosh-ptest \
    python3-wpa-supplicant \
    python3-xlrd-ptest \
    python3-xmltodict-ptest \
    python3-xxhash-ptest \
    python3-yappi-ptest \
    python3-yarl-ptest \
    python3-pyasn1-ptest \
"

EXCLUDE_FROM_WORLD = "1"

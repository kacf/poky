SRC_URI = "http://home.earthlink.net/~k_sheff/sw/e2tools/e2tools-0.0.16.tar.gz;md5sum=1829b2b261e0e0d07566066769b5b28b"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=fa8321a71778d26ff40690a4d371ea85"

inherit native

do_configure() {
    ./configure --prefix=${prefix}
}

do_compile() {
    oe_runmake
}

do_install() {
    oe_runmake DESTDIR=${D} install
}

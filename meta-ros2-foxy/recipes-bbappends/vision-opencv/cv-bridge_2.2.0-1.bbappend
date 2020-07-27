# Copyright (c) 2020 LG Electronics, Inc.

ROS_BUILD_DEPENDS_remove = "python-numpy"
ROS_BUILD_DEPENDS_remove = "python3-numpy"

ROS_BUILDTOOL_DEPENDS += " \
    ${PYTHON_PN}-numpy-native \
"

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI += " \
    file://0002-CMakeLists.txt-search-for-boost_python37-instead-of-.patch \
"
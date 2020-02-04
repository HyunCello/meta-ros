# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "A library to access URDFs using the DOM model."
AUTHOR = "Steven! Ragnarök <steven@osrfoundation.org>"
ROS_AUTHOR = "Wim Meeussen"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "urdfdom"
ROS_BPN = "urdfdom"

ROS_BUILD_DEPENDS = " \
    console-bridge \
    console-bridge-vendor \
    libtinyxml \
    tinyxml-vendor \
    urdfdom-headers \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    console-bridge \
    console-bridge-vendor \
    libtinyxml \
    tinyxml-vendor \
    urdfdom-headers \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/urdfdom-release/archive/release/eloquent/urdfdom/2.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/urdfdom"
SRC_URI = "git://github.com/ros2-gbp/urdfdom-release;${ROS_BRANCH};protocol=https"
SRCREV = "6531a9d8a027dfb3c6d7ac1398830c8726a71da5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}

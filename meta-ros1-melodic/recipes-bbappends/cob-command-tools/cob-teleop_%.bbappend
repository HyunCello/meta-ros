# Copyright (c) 2020 LG Electronics, Inc.

PNBLACKLIST[cob-teleop] ?= "${@ 'Requires cob-sound which depends on vlc which requires meta-multimedia to be included' if 'multimedia-layer' not in BBFILE_COLLECTIONS.split() else '' }"

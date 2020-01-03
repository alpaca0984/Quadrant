package com.gaelmarhic.quadrant.constants

import java.io.File

object GeneralConstants {

    const val PLUGIN_NAME = "Quadrant"
    val PLUGIN_CONFIG = "${PLUGIN_NAME.toLowerCase()}Config"
    val TARGET_DIRECTORY = "generated${File.separator}source${File.separator}${PLUGIN_NAME.toLowerCase()}"
    val PACKAGE = "com.gaelmarhic.${PLUGIN_NAME.toLowerCase()}"
}

object ModelConstants {

    const val MANIFEST_TAG = "manifest"
    const val APPLICATION_TAG = "application"
    const val ACTIVITY_TAG = "activity"
    const val ACTIVITY_NAME_ATTRIBUTE = "name"
    const val METADATA_TAG = "meta-data"
    const val METADATA_NAME_ATTRIBUTE = "name"
    const val METADATA_VALUE_ATTRIBUTE = "value"
    const val ANDROID_NAMESPACE = "http://schemas.android.com/apk/res/android"
}

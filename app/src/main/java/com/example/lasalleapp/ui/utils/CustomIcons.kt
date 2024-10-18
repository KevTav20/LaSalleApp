package com.example.lasalleapp.ui.utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Logout: ImageVector
    get() {
        if (_Logout != null) {
            return _Logout!!
        }
        _Logout = ImageVector.Builder(
            name = "Logout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(440f, -160f)
                lineToRelative(-55f, -58f)
                lineToRelative(102f, -102f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineTo(585f, 338f)
                lineToRelative(55f, -58f)
                lineToRelative(200f, 200f)
                close()
            }
        }.build()
        return _Logout!!
    }

private var _Logout: ImageVector? = null

public val Task: ImageVector
    get() {
        if (_Task != null) {
            return _Task!!
        }
        _Task = ImageVector.Builder(
            name = "Task",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(438f, 720f)
                lineToRelative(226f, -226f)
                lineToRelative(-58f, -58f)
                lineToRelative(-169f, 169f)
                lineToRelative(-84f, -84f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(280f, -520f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-440f)
                close()
                moveTo(240f, 160f)
                verticalLineToRelative(200f)
                close()
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        return _Task!!
    }

private var _Task: ImageVector? = null

public val Cash: ImageVector
    get() {
        if (_Cash != null) {
            return _Cash!!
        }
        _Cash = ImageVector.Builder(
            name = "Cash",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(0f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
                moveToRelative(3f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                close()
            }
        }.build()
        return _Cash!!
    }

private var _Cash: ImageVector? = null

public val Cake2: ImageVector
    get() {
        if (_Cake2 != null) {
            return _Cake2!!
        }
        _Cake2 = ImageVector.Builder(
            name = "Cake2",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(3.494f, 0.013f)
                lineToRelative(-0.595f, 0.79f)
                arcTo(0.747f, 0.747f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 1.814f)
                verticalLineToRelative(2.683f)
                quadToRelative(-0.224f, 0.051f, -0.432f, 0.107f)
                curveToRelative(-0.702f, 0.187f, -1.305f, 0.418f, -1.745f, 0.696f)
                curveTo(0.408f, 5.56f, 0f, 5.954f, 0f, 6.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.546f, 0.408f, 0.94f, 0.823f, 1.201f)
                curveToRelative(0.44f, 0.278f, 1.043f, 0.51f, 1.745f, 0.696f)
                curveTo(3.978f, 15.773f, 5.898f, 16f, 8f, 16f)
                reflectiveCurveToRelative(4.022f, -0.227f, 5.432f, -0.603f)
                curveToRelative(0.701f, -0.187f, 1.305f, -0.418f, 1.745f, -0.696f)
                curveToRelative(0.415f, -0.261f, 0.823f, -0.655f, 0.823f, -1.201f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.546f, -0.408f, -0.94f, -0.823f, -1.201f)
                curveToRelative(-0.44f, -0.278f, -1.043f, -0.51f, -1.745f, -0.696f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 4.496f)
                verticalLineToRelative(-2.69f)
                arcToRelative(0.747f, 0.747f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.092f, -1.004f)
                lineToRelative(-0.598f, -0.79f)
                lineToRelative(-0.595f, 0.792f)
                arcTo(0.747f, 0.747f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1.813f)
                verticalLineTo(4.3f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -0.23f)
                verticalLineTo(1.806f)
                arcToRelative(0.747f, 0.747f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.092f, -1.004f)
                lineToRelative(-0.598f, -0.79f)
                lineToRelative(-0.595f, 0.792f)
                arcTo(0.747f, 0.747f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 1.813f)
                verticalLineToRelative(2.204f)
                arcToRelative(29f, 29f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(1.806f)
                arcTo(0.747f, 0.747f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.092f, 0.802f)
                lineToRelative(-0.598f, -0.79f)
                lineToRelative(-0.595f, 0.792f)
                arcTo(0.747f, 0.747f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 1.813f)
                verticalLineTo(4.07f)
                curveToRelative(-0.71f, 0.05f, -1.383f, 0.129f, -2f, 0.23f)
                verticalLineTo(1.806f)
                arcTo(0.747f, 0.747f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.092f, 0.802f)
                close()
                moveToRelative(-0.668f, 5.556f)
                lineTo(3f, 5.524f)
                verticalLineToRelative(0.967f)
                quadToRelative(0.468f, 0.111f, 1f, 0.201f)
                verticalLineTo(5.315f)
                arcToRelative(21f, 21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -0.242f)
                verticalLineToRelative(1.855f)
                quadToRelative(0.488f, 0.036f, 1f, 0.054f)
                verticalLineTo(5.018f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(1.964f)
                quadToRelative(0.512f, -0.018f, 1f, -0.054f)
                verticalLineTo(5.073f)
                curveToRelative(0.72f, 0.054f, 1.393f, 0.137f, 2f, 0.242f)
                verticalLineToRelative(1.377f)
                quadToRelative(0.532f, -0.09f, 1f, -0.201f)
                verticalLineToRelative(-0.967f)
                lineToRelative(0.175f, 0.045f)
                curveToRelative(0.655f, 0.175f, 1.15f, 0.374f, 1.469f, 0.575f)
                curveToRelative(0.344f, 0.217f, 0.356f, 0.35f, 0.356f, 0.356f)
                reflectiveCurveToRelative(-0.012f, 0.139f, -0.356f, 0.356f)
                curveToRelative(-0.319f, 0.2f, -0.814f, 0.4f, -1.47f, 0.575f)
                curveTo(11.87f, 7.78f, 10.041f, 8f, 8f, 8f)
                curveToRelative(-2.04f, 0f, -3.87f, -0.221f, -5.174f, -0.569f)
                curveToRelative(-0.656f, -0.175f, -1.151f, -0.374f, -1.47f, -0.575f)
                curveTo(1.012f, 6.639f, 1f, 6.506f, 1f, 6.5f)
                reflectiveCurveToRelative(0.012f, -0.139f, 0.356f, -0.356f)
                curveToRelative(0.319f, -0.2f, 0.814f, -0.4f, 1.47f, -0.575f)
                moveTo(15f, 7.806f)
                verticalLineToRelative(1.027f)
                lineToRelative(-0.68f, 0.907f)
                arcToRelative(0.94f, 0.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.17f, 0.276f)
                arcToRelative(1.94f, 1.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.236f, 0.363f)
                lineToRelative(-0.348f, 0.348f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.307f, 0.092f)
                lineToRelative(-0.06f, -0.044f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.399f, 0f)
                lineToRelative(-0.06f, 0.044f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.306f, -0.092f)
                lineToRelative(-0.35f, -0.35f)
                arcToRelative(1.935f, 1.935f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.233f, -0.362f)
                arcToRelative(0.935f, 0.935f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.168f, -0.277f)
                lineTo(1f, 8.82f)
                verticalLineTo(7.806f)
                curveToRelative(0.42f, 0.232f, 0.956f, 0.428f, 1.568f, 0.591f)
                curveTo(3.978f, 8.773f, 5.898f, 9f, 8f, 9f)
                reflectiveCurveToRelative(4.022f, -0.227f, 5.432f, -0.603f)
                curveToRelative(0.612f, -0.163f, 1.149f, -0.36f, 1.568f, -0.591f)
                moveToRelative(0f, 2.679f)
                verticalLineTo(13.5f)
                curveToRelative(0f, 0.006f, -0.012f, 0.139f, -0.356f, 0.355f)
                curveToRelative(-0.319f, 0.202f, -0.814f, 0.401f, -1.47f, 0.576f)
                curveTo(11.87f, 14.78f, 10.041f, 15f, 8f, 15f)
                curveToRelative(-2.04f, 0f, -3.87f, -0.221f, -5.174f, -0.569f)
                curveToRelative(-0.656f, -0.175f, -1.151f, -0.374f, -1.47f, -0.575f)
                curveToRelative(-0.344f, -0.217f, -0.356f, -0.35f, -0.356f, -0.356f)
                verticalLineToRelative(-3.02f)
                arcToRelative(1.935f, 1.935f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.298f, 0.43f)
                arcToRelative(0.935f, 0.935f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.08f, 0.175f)
                lineToRelative(0.348f, 0.349f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.615f, 0.185f)
                lineToRelative(0.059f, -0.044f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.2f, 0f)
                lineToRelative(0.06f, 0.044f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.613f, -0.185f)
                lineToRelative(0.348f, -0.348f)
                arcToRelative(0.94f, 0.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.082f, -0.175f)
                curveToRelative(0.781f, 0.39f, 1.718f, 0.208f, 2.297f, -0.426f)
            }
        }.build()
        return _Cake2!!
    }

private var _Cake2: ImageVector? = null

public val UserRoundPen: ImageVector
    get() {
        if (_UserRoundPen != null) {
            return _UserRoundPen!!
        }
        _UserRoundPen = ImageVector.Builder(
            name = "UserRoundPen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(2f, 21f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.821f, -7.487f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(21.378f, 16.626f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.004f, -3.004f)
                lineToRelative(-4.01f, 4.012f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.506f, 0.854f)
                lineToRelative(-0.837f, 2.87f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.62f, 0.62f)
                lineToRelative(2.87f, -0.837f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.854f, -0.506f)
                close()
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(15f, 8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 13f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 8f)
                close()
            }
        }.build()
        return _UserRoundPen!!
    }

private var _UserRoundPen: ImageVector? = null

public val Passkey: ImageVector
    get() {
        if (_Passkey != null) {
            return _Passkey!!
        }
        _Passkey = ImageVector.Builder(
            name = "Passkey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(120f, 800f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(184f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(440f, 520f)
                quadToRelative(20f, 0f, 40f, 1.5f)
                reflectiveQuadToRelative(40f, 4.5f)
                quadToRelative(-4f, 58f, 21f, 109.5f)
                reflectiveQuadToRelative(73f, 84.5f)
                verticalLineToRelative(80f)
                close()
                moveTo(760f, 920f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(-186f)
                quadToRelative(-44f, -13f, -72f, -49.5f)
                reflectiveQuadTo(600f, 540f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                reflectiveQuadToRelative(99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 45f, -25.5f, 80f)
                reflectiveQuadTo(790f, 670f)
                lineToRelative(50f, 50f)
                lineToRelative(-60f, 60f)
                lineToRelative(60f, 60f)
                close()
                moveTo(440f, 480f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                reflectiveQuadToRelative(47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                reflectiveQuadToRelative(113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                reflectiveQuadToRelative(-47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                moveToRelative(300f, 80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(780f, 520f)
                reflectiveQuadToRelative(-11.5f, -28.5f)
                reflectiveQuadTo(740f, 480f)
                reflectiveQuadToRelative(-28.5f, 11.5f)
                reflectiveQuadTo(700f, 520f)
                reflectiveQuadToRelative(11.5f, 28.5f)
                reflectiveQuadTo(740f, 560f)
            }
        }.build()
        return _Passkey!!
    }

private var _Passkey: ImageVector? = null

public val Notifications: ImageVector
    get() {
        if (_Notifications != null) {
            return _Notifications!!
        }
        _Notifications = ImageVector.Builder(
            name = "Notifications",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(160f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -83f, 50f, -147.5f)
                reflectiveQuadTo(420f, 168f)
                verticalLineToRelative(-28f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 80f)
                reflectiveQuadToRelative(42.5f, 17.5f)
                reflectiveQuadTo(540f, 140f)
                verticalLineToRelative(28f)
                quadToRelative(80f, 20f, 130f, 84.5f)
                reflectiveQuadTo(720f, 400f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                moveTo(320f, 680f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                reflectiveQuadToRelative(-113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                close()
            }
        }.build()
        return _Notifications!!
    }

private var _Notifications: ImageVector? = null

public val MoonStars: ImageVector
    get() {
        if (_MoonStars != null) {
            return _MoonStars!!
        }
        _MoonStars = ImageVector.Builder(
            name = "MoonStars",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(6f, 0.278f)
                arcToRelative(0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.08f, 0.858f)
                arcToRelative(7.2f, 7.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.878f, 3.46f)
                curveToRelative(0f, 4.021f, 3.278f, 7.277f, 7.318f, 7.277f)
                quadToRelative(0.792f, -0.001f, 1.533f, -0.16f)
                arcToRelative(0.79f, 0.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.81f, 0.316f)
                arcToRelative(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.031f, 0.893f)
                arcTo(8.35f, 8.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.344f, 16f)
                curveTo(3.734f, 16f, 0f, 12.286f, 0f, 7.71f)
                curveTo(0f, 4.266f, 2.114f, 1.312f, 5.124f, 0.06f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0.278f)
                moveTo(4.858f, 1.311f)
                arcTo(7.27f, 7.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.025f, 7.71f)
                curveToRelative(0f, 4.02f, 3.279f, 7.276f, 7.319f, 7.276f)
                arcToRelative(7.32f, 7.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.205f, -2.162f)
                quadToRelative(-0.506f, 0.063f, -1.029f, 0.063f)
                curveToRelative(-4.61f, 0f, -8.343f, -3.714f, -8.343f, -8.29f)
                curveToRelative(0f, -1.167f, 0.242f, -2.278f, 0.681f, -3.286f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(10.794f, 3.148f)
                arcToRelative(0.217f, 0.217f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.412f, 0f)
                lineToRelative(0.387f, 1.162f)
                curveToRelative(0.173f, 0.518f, 0.579f, 0.924f, 1.097f, 1.097f)
                lineToRelative(1.162f, 0.387f)
                arcToRelative(0.217f, 0.217f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0.412f)
                lineToRelative(-1.162f, 0.387f)
                arcToRelative(1.73f, 1.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.097f, 1.097f)
                lineToRelative(-0.387f, 1.162f)
                arcToRelative(0.217f, 0.217f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.412f, 0f)
                lineToRelative(-0.387f, -1.162f)
                arcTo(1.73f, 1.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.31f, 6.593f)
                lineToRelative(-1.162f, -0.387f)
                arcToRelative(0.217f, 0.217f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -0.412f)
                lineToRelative(1.162f, -0.387f)
                arcToRelative(1.73f, 1.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.097f, -1.097f)
                close()
                moveTo(13.863f, 0.099f)
                arcToRelative(0.145f, 0.145f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.274f, 0f)
                lineToRelative(0.258f, 0.774f)
                curveToRelative(0.115f, 0.346f, 0.386f, 0.617f, 0.732f, 0.732f)
                lineToRelative(0.774f, 0.258f)
                arcToRelative(0.145f, 0.145f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0.274f)
                lineToRelative(-0.774f, 0.258f)
                arcToRelative(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.732f, 0.732f)
                lineToRelative(-0.258f, 0.774f)
                arcToRelative(0.145f, 0.145f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.274f, 0f)
                lineToRelative(-0.258f, -0.774f)
                arcToRelative(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.732f, -0.732f)
                lineToRelative(-0.774f, -0.258f)
                arcToRelative(0.145f, 0.145f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -0.274f)
                lineToRelative(0.774f, -0.258f)
                curveToRelative(0.346f, -0.115f, 0.617f, -0.386f, 0.732f, -0.732f)
                close()
            }
        }.build()
        return _MoonStars!!
    }

private var _MoonStars: ImageVector? = null

public val Languages: ImageVector
    get() {
        if (_Languages != null) {
            return _Languages!!
        }
        _Languages = ImageVector.Builder(
            name = "Languages",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(5f, 8f)
                lineToRelative(6f, 6f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4f, 14f)
                lineToRelative(6f, -6f)
                lineToRelative(2f, -3f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(2f, 5f)
                horizontalLineToRelative(12f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(7f, 2f)
                horizontalLineToRelative(1f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(22f, 22f)
                lineToRelative(-5f, -10f)
                lineToRelative(-5f, 10f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(14f, 18f)
                horizontalLineToRelative(6f)
            }
        }.build()
        return _Languages!!
    }

private var _Languages: ImageVector? = null

public val Help: ImageVector
    get() {
        if (_Help != null) {
            return _Help!!
        }
        _Help = ImageVector.Builder(
            name = "Help",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(478f, 720f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(528f, 670f)
                reflectiveQuadToRelative(-14.5f, -35.5f)
                reflectiveQuadTo(478f, 620f)
                reflectiveQuadToRelative(-35.5f, 14.5f)
                reflectiveQuadTo(428f, 670f)
                reflectiveQuadToRelative(14.5f, 35.5f)
                reflectiveQuadTo(478f, 720f)
                moveToRelative(-36f, -154f)
                horizontalLineToRelative(74f)
                quadToRelative(0f, -33f, 7.5f, -52f)
                reflectiveQuadToRelative(42.5f, -52f)
                quadToRelative(26f, -26f, 41f, -49.5f)
                reflectiveQuadToRelative(15f, -56.5f)
                quadToRelative(0f, -56f, -41f, -86f)
                reflectiveQuadToRelative(-97f, -30f)
                quadToRelative(-57f, 0f, -92.5f, 30f)
                reflectiveQuadTo(342f, 342f)
                lineToRelative(66f, 26f)
                quadToRelative(5f, -18f, 22.5f, -39f)
                reflectiveQuadToRelative(53.5f, -21f)
                quadToRelative(32f, 0f, 48f, 17.5f)
                reflectiveQuadToRelative(16f, 38.5f)
                quadToRelative(0f, 20f, -12f, 37.5f)
                reflectiveQuadTo(506f, 434f)
                quadToRelative(-44f, 39f, -54f, 59f)
                reflectiveQuadToRelative(-10f, 73f)
                moveToRelative(38f, 314f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                reflectiveQuadToRelative(-85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                reflectiveQuadToRelative(31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                reflectiveQuadToRelative(127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                reflectiveQuadToRelative(156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                reflectiveQuadToRelative(85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                reflectiveQuadToRelative(-31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                reflectiveQuadToRelative(-127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                reflectiveQuadToRelative(-93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                reflectiveQuadToRelative(-227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                reflectiveQuadToRelative(93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                moveToRelative(0f, -320f)
            }
        }.build()
        return _Help!!
    }

private var _Help: ImageVector? = null






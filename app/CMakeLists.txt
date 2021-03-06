# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.4.1)

set(CX_ENGINE_PATH /Users/xuhua/cxengine)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=gnu++11")

include_directories(
                    ${CX_ENGINE_PATH}
                    ${CX_ENGINE_PATH}/android
                    src/main/cpp
                    ${CX_ENGINE_PATH}/libs/android/include)

set(LIBS_DIR ${CX_ENGINE_PATH}/libs/android/lib/${ANDROID_ABI})

add_library(uv STATIC IMPORTED)
set_target_properties(uv PROPERTIES IMPORTED_LOCATION ${LIBS_DIR}/libuv.a)

add_library(mpg123 STATIC IMPORTED)
set_target_properties(mpg123 PROPERTIES IMPORTED_LOCATION ${LIBS_DIR}/libmpg123.a)

add_library(png STATIC IMPORTED)
set_target_properties(png PROPERTIES IMPORTED_LOCATION ${LIBS_DIR}/libpng.a)

add_library(openal STATIC IMPORTED)
set_target_properties(openal PROPERTIES IMPORTED_LOCATION ${LIBS_DIR}/libopenal.a)


# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.

add_library( # Sets the name of the library.
             game

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             ${CX_ENGINE_PATH}/ext/xxtea.c
             ${CX_ENGINE_PATH}/ext/aabb2.c
             ${CX_ENGINE_PATH}/ext/aabb3.c
             ${CX_ENGINE_PATH}/ext/aes_cbc.c
             ${CX_ENGINE_PATH}/ext/aes_cfb.c
             ${CX_ENGINE_PATH}/ext/aes_core.c
             ${CX_ENGINE_PATH}/ext/aes_ctr.c
             ${CX_ENGINE_PATH}/ext/aes_ecb.c
             ${CX_ENGINE_PATH}/ext/aes_ige.c
             ${CX_ENGINE_PATH}/ext/aes_ofb.c
             ${CX_ENGINE_PATH}/ext/base64.c
             ${CX_ENGINE_PATH}/ext/csv.c
             ${CX_ENGINE_PATH}/ext/dump.c
             ${CX_ENGINE_PATH}/ext/error.c
             ${CX_ENGINE_PATH}/ext/hashtable_seed.c
             ${CX_ENGINE_PATH}/ext/hashtable.c
             ${CX_ENGINE_PATH}/ext/http_parser.c
             ${CX_ENGINE_PATH}/ext/load.c
             ${CX_ENGINE_PATH}/ext/LzFind.c
             ${CX_ENGINE_PATH}/ext/lzma.c
             ${CX_ENGINE_PATH}/ext/LzmaDec.c
             ${CX_ENGINE_PATH}/ext/LzmaEnc.c
             ${CX_ENGINE_PATH}/ext/LzmaLib.c
             ${CX_ENGINE_PATH}/ext/mat3.c
             ${CX_ENGINE_PATH}/ext/mat4.c
             ${CX_ENGINE_PATH}/ext/mat4stack.c
             ${CX_ENGINE_PATH}/ext/matrix.c
             ${CX_ENGINE_PATH}/ext/md5.c
             ${CX_ENGINE_PATH}/ext/memory.c
             ${CX_ENGINE_PATH}/ext/pack_unpack.c
             ${CX_ENGINE_PATH}/ext/plane.c
             ${CX_ENGINE_PATH}/ext/quaternion.c
             ${CX_ENGINE_PATH}/ext/ray2.c
             ${CX_ENGINE_PATH}/ext/ray3.c
             ${CX_ENGINE_PATH}/ext/strbuffer.c
             ${CX_ENGINE_PATH}/ext/strconv.c
             ${CX_ENGINE_PATH}/ext/utf.c
             ${CX_ENGINE_PATH}/ext/utf8.c
             ${CX_ENGINE_PATH}/ext/utility.c
             ${CX_ENGINE_PATH}/ext/value.c
             ${CX_ENGINE_PATH}/ext/vec2.c
             ${CX_ENGINE_PATH}/ext/vec3.c
             ${CX_ENGINE_PATH}/ext/vec4.c
             ${CX_ENGINE_PATH}/ext/xxhash.c
             ${CX_ENGINE_PATH}/ext/xxtea.c

             ${CX_ENGINE_PATH}/core/cxArray.cpp
             ${CX_ENGINE_PATH}/core/cxAutoPool.cpp
             ${CX_ENGINE_PATH}/core/cxCore.cpp
             ${CX_ENGINE_PATH}/core/cxCSV.cpp
             ${CX_ENGINE_PATH}/core/cxEvent.cpp
             ${CX_ENGINE_PATH}/core/cxHash.cpp
             ${CX_ENGINE_PATH}/core/cxJson.cpp
             ${CX_ENGINE_PATH}/core/cxKDTree.cpp
             ${CX_ENGINE_PATH}/core/cxList.cpp
             ${CX_ENGINE_PATH}/core/cxLocalized.cpp
             ${CX_ENGINE_PATH}/core/cxLQT.cpp
             ${CX_ENGINE_PATH}/core/cxNotice.cpp
             ${CX_ENGINE_PATH}/core/cxNumber.cpp
             ${CX_ENGINE_PATH}/core/cxObject.cpp
             ${CX_ENGINE_PATH}/core/cxQueue.cpp
             ${CX_ENGINE_PATH}/core/cxStack.cpp
             ${CX_ENGINE_PATH}/core/cxStr.cpp
             ${CX_ENGINE_PATH}/core/cxSync.cpp
             ${CX_ENGINE_PATH}/core/cxUtil.cpp

             ${CX_ENGINE_PATH}/math/cxBox4F.cpp
             ${CX_ENGINE_PATH}/math/cxBoxColor4F.cpp
             ${CX_ENGINE_PATH}/math/cxBoxCoord2F.cpp
             ${CX_ENGINE_PATH}/math/cxBoxPoint2F.cpp
             ${CX_ENGINE_PATH}/math/cxBoxPoint3F.cpp
             ${CX_ENGINE_PATH}/math/cxBoxRender.cpp
             ${CX_ENGINE_PATH}/math/cxColor4F.cpp
             ${CX_ENGINE_PATH}/math/cxLineF.cpp
             ${CX_ENGINE_PATH}/math/cxMath.cpp
             ${CX_ENGINE_PATH}/math/cxMatrixF.cpp
             ${CX_ENGINE_PATH}/math/cxPoint2F.cpp
             ${CX_ENGINE_PATH}/math/cxPoint2I.cpp
             ${CX_ENGINE_PATH}/math/cxPoint3F.cpp
             ${CX_ENGINE_PATH}/math/cxRect4F.cpp
             ${CX_ENGINE_PATH}/math/cxRect4I.cpp
             ${CX_ENGINE_PATH}/math/cxRenderF.cpp
             ${CX_ENGINE_PATH}/math/cxSize2F.cpp

             ${CX_ENGINE_PATH}/engine/cxAction.cpp
             ${CX_ENGINE_PATH}/engine/cxActionGroup.cpp
             ${CX_ENGINE_PATH}/engine/cxAlert.cpp
             ${CX_ENGINE_PATH}/engine/cxAnimate.cpp
             ${CX_ENGINE_PATH}/engine/cxAstar.cpp
             ${CX_ENGINE_PATH}/engine/cxAsync.cpp
             ${CX_ENGINE_PATH}/engine/cxAtlas.cpp
             ${CX_ENGINE_PATH}/engine/cxBezier.cpp
             ${CX_ENGINE_PATH}/engine/cxButton.cpp
             ${CX_ENGINE_PATH}/engine/cxCircle.cpp
             ${CX_ENGINE_PATH}/engine/cxContainer.cpp
             ${CX_ENGINE_PATH}/engine/cxCustom.cpp
             ${CX_ENGINE_PATH}/engine/cxDraw.cpp
             ${CX_ENGINE_PATH}/engine/cxEmitter.cpp
             ${CX_ENGINE_PATH}/engine/cxEngine.cpp
             ${CX_ENGINE_PATH}/engine/cxFade.cpp
             ${CX_ENGINE_PATH}/engine/cxFollow.cpp
             ${CX_ENGINE_PATH}/engine/cxForward.cpp
             ${CX_ENGINE_PATH}/engine/cxFrames.cpp
             ${CX_ENGINE_PATH}/engine/cxHttp.cpp
             ${CX_ENGINE_PATH}/engine/cxJump.cpp
             ${CX_ENGINE_PATH}/engine/cxLabel.cpp
             ${CX_ENGINE_PATH}/engine/cxLoading.cpp
             ${CX_ENGINE_PATH}/engine/cxMove.cpp
             ${CX_ENGINE_PATH}/engine/cxMultiple.cpp
             ${CX_ENGINE_PATH}/engine/cxMusic.cpp
             ${CX_ENGINE_PATH}/engine/cxOpenAL.cpp
             ${CX_ENGINE_PATH}/engine/cxOpenGL.cpp
             ${CX_ENGINE_PATH}/engine/cxPath.cpp
             ${CX_ENGINE_PATH}/engine/cxPoints.cpp
             ${CX_ENGINE_PATH}/engine/cxProgress.cpp
             ${CX_ENGINE_PATH}/engine/cxRand.cpp
             ${CX_ENGINE_PATH}/engine/cxRender.cpp
             ${CX_ENGINE_PATH}/engine/cxResize.cpp
             ${CX_ENGINE_PATH}/engine/cxRotate.cpp
             ${CX_ENGINE_PATH}/engine/cxScale.cpp
             ${CX_ENGINE_PATH}/engine/cxScript.cpp
             ${CX_ENGINE_PATH}/engine/cxSequence.cpp
             ${CX_ENGINE_PATH}/engine/cxShader.cpp
             ${CX_ENGINE_PATH}/engine/cxSpline.cpp
             ${CX_ENGINE_PATH}/engine/cxSprite.cpp
             ${CX_ENGINE_PATH}/engine/cxTable.cpp
             ${CX_ENGINE_PATH}/engine/cxTcp.cpp
             ${CX_ENGINE_PATH}/engine/cxTexture.cpp
             ${CX_ENGINE_PATH}/engine/cxTimeLine.cpp
             ${CX_ENGINE_PATH}/engine/cxTimer.cpp
             ${CX_ENGINE_PATH}/engine/cxTiming.cpp
             ${CX_ENGINE_PATH}/engine/cxTint.cpp
             ${CX_ENGINE_PATH}/engine/cxTouch.cpp
             ${CX_ENGINE_PATH}/engine/cxTriangles.cpp
             ${CX_ENGINE_PATH}/engine/cxView.cpp
             ${CX_ENGINE_PATH}/engine/cxWindow.cpp

             ${CX_ENGINE_PATH}/android/cxAndroid.cpp
             ${CX_ENGINE_PATH}/android/cxAndroidUtil.cpp

             src/main/cpp/Game.cpp)


target_link_libraries( # Specifies the target library.
                       game
                       uv
                       mpg123
                       png
                       openal
                       log
                       GLESv2
                       z
                       android
                       EGL
                       OpenSLES
                       atomic)
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <declare-styleable name="AnimatedStateListDrawableCompat">
        <!-- Indicates whether the drawable should be initially visible. -->
        <attr name="android:visible"/>
        <!-- If true, allows the drawable's padding to change based on the
             current state that is selected.  If false, the padding will
             stay the same (based on the maximum padding of all the states).
             Enabling this feature requires that the owner of the drawable
             deal with performing layout when the state changes, which is
             often not supported. -->
        <attr name="android:variablePadding"/>
        <!-- If true, the drawable's reported internal size will remain
             constant as the state changes; the size is the maximum of all
             of the states.  If false, the size will vary based on the
             current state. -->
        <attr name="android:constantSize"/>
        <!-- Enables or disables dithering of the bitmap if the bitmap does not have the
             same pixel configuration as the screen (for instance: a ARGB 8888 bitmap with
             an RGB 565 screen). -->
        <attr name="android:dither"/>
        <!-- Amount of time (in milliseconds) to fade in a new state drawable. -->
        <attr name="android:enterFadeDuration"/>
        <!-- Amount of time (in milliseconds) to fade out an old state drawable. -->
        <attr name="android:exitFadeDuration"/>
        <!-- Indicates if the drawable needs to be mirrored when its layout direction is
             RTL (right-to-left). -->
        <!--<attr name="autoMirrored"/>-->
    </declare-styleable>
    <declare-styleable name="AnimatedStateListDrawableItem">
        <!-- Reference to a drawable resource to use for the frame.  If not
             given, the drawable must be defined by the first child tag. -->
        <attr name="android:drawable"/>
        <!-- Keyframe identifier for use in specifying transitions. -->
        <attr name="android:id"/>
    </declare-styleable>
    <declare-styleable name="AnimatedStateListDrawableTransition">
        <!-- Keyframe identifier for the starting state. -->
        <attr name="android:fromId"/>
        <!-
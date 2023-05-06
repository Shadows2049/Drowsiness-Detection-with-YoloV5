package com.tencent.nanodetncnn;
import android.media.AudioManager;
import android.media.ToneGenerator;
public class Sound
{

    static {
        System.loadLibrary("libJNI_CPP");
    }

    public static void main(String[] args) {
        new Sound().callback();
    }

    public native void callback();

    public int voiceF(){
        ToneGenerator toneG = new ToneGenerator(AudioManager.STREAM_ALARM, 500);
        toneG.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD, 200);
        return 10;
    }

    public void printNum(int i) {
        System.out.println("Got int from C++: " + i);
    }
};
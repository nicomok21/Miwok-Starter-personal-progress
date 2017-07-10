package com.example.android.miwok;

/**
 * Created by Nico on 15-6-2017.
 * {@link Word} represents a vocabulary word that the user wants to learn. Contains default and miwok translation
 */

public class Word {

    /**Default translation for the word*/
    private String mDefaultTranslation;

    /**Miwok translation for the word*/
    private String mMiwokTranslation;

    private int mAudioResourceId;

    /**Image associated with the word*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;



    /**Create a new word object*
     * @param defaultTranslation is the word in the languages that is set default (system)
     * @param miwokTranslation is the word in Miwok
     * @param imageResourceId the drawable resource Id for the images asset
     */

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioFileId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioFileId;
    }

    public Word(String defaultTranslation, String miwokTranslation,int audioFileId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioFileId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioRecourseId(){
        return mAudioResourceId;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

}

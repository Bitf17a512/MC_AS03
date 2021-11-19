package com.example.quizapp;

public class Question {


    public String questions[] = {
            "Where is the sound of 'أ' produced from?",
            "Where is the sound of 'ہ' produced from?",
            "Where is the sound of 'ح' produced from?",
            "Where is the sound of 'ع' produced from?",
            "Where is the sound of 'غ' produced from?",
            "Where is the sound of 'خ' produced from?",
            "Where is the sound of 'ق' produced from?",
            "Where is the sound of 'ک' produced from?",
            "Where is the sound of 'ش' produced from?",
            "Where is the sound of 'ی' produced from?",
            "Where is the sound of 'ج' produced from?",
            "Where is the sound of 'ض' produced from?",
            "Where is the sound of 'ل' produced from?",
            "Where is the sound of 'ن' produced from?",
            "Where is the sound of 'ر' produced from?",
            "Where is the sound of 'ط' produced from?",
            "Where is the sound of 'د' produced from?",
            "Where is the sound of 'ت' produced from?",
            "Where is the sound of 'ث' produced from?",
            "Where is the sound of 'ظ' produced from?",
            "Where is the sound of 'ذ' produced from?",
            "Where is the sound of 'س' produced from?",
            "Where is the sound of 'ز' produced from?",
            "Where is the sound of 'ص' produced from?",
            "Where is the sound of 'م' produced ",
            "Where is the sound of 'ن' produced ",
            "Where is the sound of 'ف' produced from?",
            "Where is the sound of 'ب' produced from?",
            "Where is the sound of 'و' produced from?",
            "Where is the sound of 'ز' produced from?",



    };

    public String choices[][] = {
            {"End of throat", "Middle of throat", "Start of throat", "Base of tongue"},
            {"Base of tongue", "End of throat", "Middle of throat", "Start of throat"},
            {"Base of tongue", "End of throat", "Middle of throat", "Start of throat"},
            {"Base of tongue", "End of throat", "Middle of throat", "Start of throat"},
            {"Base of tongue", "End of throat", "Start of throat", "Middle of throat"},
            {"Base of tongue", "End of throat", "Middle of throat", "Start of throat"},
            {"Base of tongue", "End of throat", "Middle of throat", "Start of throat"},
            { "End of throat","Portion of Tongue near its base touching the roof of mouth", "Middle of throat", "Start of throat"},
            {"Start of throat", "Base of tongue", "End of throat", "Tongue touching the center of the mouth roof"},
            {"Start of throat", "Base of tongue", "Upper portion of mouth", "Tongue touching the center of the mouth roof"},
            {"Start of throat", "Base of tongue", "Tongue touching the center of the mouth roof", "Upper POrtion of mouth"},
            {"Start of throat", "One Side of the tongue touching the moral teeth", "Tongue touching the center of the mouth roof", "Upper POrtion of mouth"},
            {"End of throat", "Tongue touching the center of the mouth roof", "Round tip of the tongue touching the base of the frontal 8 teeth", "Base of tongue"},
            {"End of throat", "Tongue touching the center of the mouth roof", "Round tip of the tongue touching the base of the frontal 8 teeth", "Round tip of the tongue touching the base of the frontal 6 teeth"},
            {"End of throat", "Tongue touching the center of the mouth roof", "Round tip of the tongue touching the base of the frontal 8 teeth", "Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth"},
            {"Tip of the tongue touching the base of the front teeth", "End of throat", "Tongue touching the center of the mouth roof", "Upper portion of mouth"},
            {"End of throat", "Tip of the tongue touching the base of the front teeth", "Round tip of the tongue touching the base of the frontal 8 teeth", "Upper portion of mouth"},
            {"End of throat", "Tip of the tongue touching the base of the front teeth", "Round tip of the tongue touching the base of the frontal 8 teeth", "Upper portion of mouth"},
            {"Base of tongue", "Tip of the tongue touching the tip of the frontal 2 teeth", "Middle of throat", "Start of throat"},
            {"Start of throat", "One Side of the tongue touching the moral teeth", "Tip of the tongue touching the tip of the frontal 2 teeth", "Upper Portion of mouth"},
            {"Tip of the tongue touching the tip of the frontal 2 teeth", "End of throat", "Middle of throat", "Start of throat"},
            {"End of throat", "Tongue touching the center of the mouth roof", "Round tip of the tongue touching the base of the frontal 8 teeth", "Tip of the tongue comes between the front top and bottom teeth"},
            {"Tip of the tongue comes between the front top and bottom teeth", "Tongue touching the center of the mouth roof", "Round tip of the tongue touching the base of the frontal 8 teeth", "Base of tongue"},
            {"Tip of the tongue comes between the front top and bottom teeth", "Tongue touching the center of the mouth roof", "Round tip of the tongue touching the base of the frontal 8 teeth", "Base of tongue"},
            {"End of throat", "Tip of the tongue touching the base of the front teeth", "Round tip of the tongue touching the base of the frontal 8 teeth", "While bringing the vibration to the nose"},
            {"End of throat", "While bringing the vibration to the nose", "Round tip of the tongue touching the base of the frontal 8 teeth", "Upper portion of mouth"},
            {"Base of tongue", "Tip of the two upper jaw teeth touches the inner part of the lower lip", "Start of throat", "Middle of throat"},
            {"Inner part of the both lips touch each other", "Tip of the two upper jaw teeth touches the inner part of the lower lip", "Start of throat", "Middle of throat"},
            {"Inner part of the both lips touch each other", "Tip of the two upper jaw teeth touches the inner part of the lower lip", "Rounding both lips and not closing the mouth", "Middle of throat"},




    };

    public String correctAnswer[] = {
            "End of throat",
            "End of throat" ,
            "Middle of throat" ,
            "Middle of throat" ,
            "Start of throat",
            "Start of throat",
            "Base of tongue",
            "Portion of Tongue near its base touching the roof of mouth",
            "Tongue touching the center of the mouth roof",
            "Tongue touching the center of the mouth roof",
            "Tongue touching the center of the mouth roof",
            "One Side of the tongue touching the moral teeth",
            "Round tip of the tongue touching the base of the frontal 8 teeth",
            "Round tip of the tongue touching the base of the frontal 6 teeth",
            "Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth",
            "Tip of the tongue touching the base of the front teeth",
            "Tip of the tongue touching the base of the front teeth",
            "Tip of the tongue touching the base of the front teeth",
            "Tip of the tongue touching the tip of the frontal 2 teeth",
            "Tip of the tongue touching the tip of the frontal 2 teeth",
            "Tip of the tongue touching the tip of the frontal 2 teeth",
            "Tip of the tongue comes between the front top and bottom teeth",
            "Tip of the tongue comes between the front top and bottom teeth",
            "Tip of the tongue comes between the front top and bottom teeth",
            "While bringing the vibration to the nose",
            "While bringing the vibration to the nose",
            "Tip of the two upper jaw teeth touches the inner part of the lower lip",
            "Inner part of the both lips touch each other",
            "Rounding both lips and not closing the mouth",
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }
    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }
    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }
    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }
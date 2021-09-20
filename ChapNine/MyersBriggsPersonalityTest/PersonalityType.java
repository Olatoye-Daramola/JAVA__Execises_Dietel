package TryoutsAgain;


public enum PersonalityType {
	//	The following were gotten off https://www.16personalities.com/personality-types
    INTJ("Architect", "Imaginative and strategic thinkers, with a plan for everything."),
    INTP("Logician", "Innovative inventors with an unquenchable thirst for knowledge"),
    ENTJ("Commander", "Bold, imaginative and strong-willed leaders, always finding a way- or making one"),
    ENTP("Debater", "Smart and curious thinkers who cannot resist an intellectual challenge"),
    INFJ("Advocate", "Quiet and mystical, yet very inspiring and tireless idealists"),
    INFP("Mediator", "Poetic, kind and altruistic people, always eager to help a good cause"),
    ENFJ("Protagonist", "Charismatic and inspiring leaders, able to mesmerize their listeners"),
    ENFP("Campaigner", "Enthusiastic, creative and sociable free spirit, who can always find a reason to smile"),
    ISTJ("Logistician", "Practical and fact-minded individuals, whose reliability cannot be doubted"),
    ISFJ("Defender", "Very dedicated and warm protectors, always ready to defend their loved ones"),
    ESTJ("Executive", "Excellent administrators, unsurpassed at managing things- or people"),
    ESFJ("Consul", "Extraordinarily caring, social and popular people, always eager to help"),
    ISTP("Virtuoso", "Bold and practical experimenters, masters of all kind of tools"),
    ISFP("Adventurer", "Flexible and charming artists, always ready to explore and experience something new"),
    ESTP("Entrepreneur", "Smart, energetic and very perceptive people, who truly enjoy living on the edge"),
    ESFP("Entertainer", "Spontaneous, energetic and enthusiastic people- life is never boring around them");

    private final String personalityType;
    private final String personalityCharacteristics;

    PersonalityType(String personalityType, String personalityCharacteristics) {
        this.personalityType = personalityType;
        this.personalityCharacteristics = personalityCharacteristics;
    }

    public String getPersonalityType() {
        return personalityType;
    }

    public String getPersonalityCharacteristics() {
        return personalityCharacteristics;
    }
}

public class Facade {
    MakeUp makeUp;
    MakeHairStyle makeHairStyle;
    Dress dress;
    public Facade(MakeUp makeUp, MakeHairStyle makeHairStyle, Dress dress)
    {
        this.makeUp = makeUp;
        this.makeHairStyle = makeHairStyle;
        this.dress = dress;
    }
    public void Start()
    {
        makeUp.MakeUpEyes();
        makeUp.MakeUpLips();
        makeUp.MakeUpEyeLashes();
        makeHairStyle.WashHair();
        makeHairStyle.HairStyle();
        dress.ChooseOutfit();
    }
    public void Stop()
    {
        dress.GetDressed();
        dress.PutOnShoes();
    }
}


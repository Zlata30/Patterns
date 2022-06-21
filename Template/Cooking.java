abstract class Cooking {
    public void CookingProcess(){
        WashProducts();
        CutProducts();
        ProcessProducts();
        MakeDish();
    }
    protected abstract void WashProducts();
    protected abstract void CutProducts();
    protected abstract void ProcessProducts();
    protected abstract void MakeDish();
}

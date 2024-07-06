package coreElements;

import org.openqa.selenium.By;

public class Link extends Element{
    public Link(By locator) {
        super(locator);
    }
    public void validateUrl(String url){
        driver.assertThat().browser().title().isEqualTo(url).perform();
    }
    public void ValidateLinkExist(){
        driver.assertThat().element(elementLocator).exists().perform();
    }
}

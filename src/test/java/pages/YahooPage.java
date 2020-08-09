package pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahooPage extends BasePage{
	
	public WebDriver driver;
	public YahooPage(WebDriver d) {
		super(d);
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//a[@href='https://mail.yahoo.com/?.src=fp']")
	private WebElement mail;
	@FindBy(xpath="//a[@href='https://news.yahoo.com/coronavirus']")
	private WebElement corona;
	@FindBy(xpath="//a[@href='https://news.yahoo.com/']")
	private WebElement news;
	@FindBy(xpath="//a[@href='https://finance.yahoo.com/']")
	private WebElement finance;
	@FindBy(xpath="//a[@href='https://sports.yahoo.com/']")
	private WebElement sports;
	@FindBy(xpath="//a[@href='https://news.yahoo.com/politics/']")
	private WebElement politics;
	@FindBy(xpath="//a[@href='https://search.yahoo.com/search?ei=UTF-8&fr=hubblm&fr2=p:fp,m:nav&p=Black%20Lives%20Matter']")
	private WebElement blacklivesmatter;
	@FindBy(xpath="//a[@href='https://www.yahoo.com/entertainment/']")
	private WebElement entertainment;
	@FindBy(xpath="//a[@href='https://www.yahoo.com/lifestyle/']")
	private WebElement life;
	@FindBy(xpath="//a[@href='https://shopping.yahoo.com/']")
	private WebElement shopping;
	@FindBy(xpath="//a[@href='https://subscriptions.yahoo.com/?ncid=mbr_ryhacqnav00000017']")
	private WebElement subcriptions;
	@FindBy(xpath="//a[@href='https://www.yahoo.com/everything/']")
	private WebElement more;
	
	
	
	
	public void printNames() {
		List<String> nameList = new ArrayList<String>();
		nameList.add(mail.getText());
		nameList.add(corona.getText());
		nameList.add(news.getText());
		nameList.add(finance.getText());
		nameList.add(sports.getText());
		nameList.add(politics.getText());
		nameList.add(blacklivesmatter.getText());
		nameList.add(entertainment.getText());
		nameList.add(life.getText());
		nameList.add(shopping.getText());
		nameList.add(subcriptions.getText());
		nameList.add(more.getText());
		
		
		
		System.out.println("Names:"+ Arrays.toString(nameList.toArray()));
	}

}

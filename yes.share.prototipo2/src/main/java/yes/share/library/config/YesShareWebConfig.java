package yes.share.library.config;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ImportResource("classpath:/applicationContext.xml")
public class YesShareWebConfig extends WebMvcConfigurerAdapter{

	@Resource(name="mainPage")
	private String mainPage;
	
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    	
    	if (mainPage.isEmpty()) {
    		mainPage = "index";
    	}
    	
        registry.addViewController("/").setViewName(mainPage);
    }
}
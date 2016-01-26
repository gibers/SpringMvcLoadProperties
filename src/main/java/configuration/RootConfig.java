package configuration;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import configuration.RootConfig.WebPackage;


@Configuration
@ImportResource("classpath:myBean.xml")
@PropertySource({"classpath:com/jbc/monpack/debiere/configFile.properties", "classpath:configFile1.properties"})
@ComponentScan(
	excludeFilters={
        @Filter(type=FilterType.CUSTOM, value=WebPackage.class)
    })
public class RootConfig {
	
//	@Autowired
//	Environment env;

	public static class WebPackage extends RegexPatternTypeFilter {
		public WebPackage() {
			super(Pattern.compile("controller"));
		}
	}

}


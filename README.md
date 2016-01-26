# SpringMvcLoadProperties
load properties files in Spring using both configuration. Not at the same time. 

Spring, chargement des fichiers de configuration avec : 
	<bean id="messageSource" class="org.springframework.context.support.ResourceBundleMessageSource">

ou dans le fichier de configuration java : 

@Bean
@Primary
public MessageSource configurationFile() {
  ResourceBundleMessageSource rbms = new ResourceBundleMessageSource();
  rbms.setBasenames("format");
  return rbms;
}




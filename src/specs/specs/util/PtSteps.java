package specs.util;

import java.util.Locale;

import org.jbehave.scenario.definition.KeyWords;
import org.jbehave.scenario.i18n.I18nKeyWords;
import org.jbehave.scenario.i18n.StringEncoder;
import org.jbehave.scenario.steps.Steps;
import org.jbehave.scenario.steps.StepsConfiguration;

public class PtSteps extends Steps {
	
	public PtSteps () {
        super(new StepsConfiguration(keywordsFor(new Locale("pt"), Steps.class.getClassLoader())));
    }
    
	protected static KeyWords keywordsFor(Locale locale, ClassLoader classLoader) {
        return new I18nKeyWords(locale, new StringEncoder(), "keywords", classLoader);
    }
}

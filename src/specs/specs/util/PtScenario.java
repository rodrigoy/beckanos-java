package specs.util;

import java.util.Locale;

import org.jbehave.scenario.JUnitScenario;
import org.jbehave.scenario.PropertyBasedConfiguration;
import org.jbehave.scenario.definition.KeyWords;
import org.jbehave.scenario.i18n.I18nKeyWords;
import org.jbehave.scenario.i18n.StringEncoder;
import org.jbehave.scenario.parser.ClasspathScenarioDefiner;
import org.jbehave.scenario.parser.PatternScenarioParser;
import org.jbehave.scenario.parser.ScenarioDefiner;
import org.jbehave.scenario.parser.UnderscoredCamelCaseResolver;
import org.jbehave.scenario.reporters.PrintStreamScenarioReporter;
import org.jbehave.scenario.reporters.ScenarioReporter;
import org.jbehave.scenario.steps.Steps;

public class PtScenario extends JUnitScenario {
 
    public PtScenario(Steps steps) {
        
    	super(new PropertyBasedConfiguration() {

    		ClassLoader classLoader = JUnitScenario.class.getClassLoader();
            
    		@Override
            public ScenarioDefiner forDefiningScenarios() {
                return new ClasspathScenarioDefiner(
                        new UnderscoredCamelCaseResolver(".spec"),
                        new PatternScenarioParser(this), classLoader);
            }
 
            @Override
            public ScenarioReporter forReportingScenarios() {
                return new PrintStreamScenarioReporter(keywordsFor(new Locale("pt"), classLoader));
            }
 
            @Override
            public KeyWords keywords() {
                return keywordsFor(new Locale("pt"), classLoader);
            }
 
        }, steps);
    }
 
    protected static KeyWords keywordsFor(Locale locale, ClassLoader classLoader) {
        return new I18nKeyWords(locale, new StringEncoder(), "keywords", classLoader);
    }
 
}

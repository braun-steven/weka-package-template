package weka.classifiers.rules;

import weka.classifiers.AbstractClassifierTest;
import weka.classifiers.Classifier;

/**
 * Weka AbstractClassifier Test Suite implementation for CustomClassifier.
 *
 * @author Author Name
 */
public class CustomClassifierAbstractClassifierTest extends AbstractClassifierTest {

    public CustomClassifierAbstractClassifierTest(String name) {
        super(name);
    }

    @Override
    public Classifier getClassifier() {
        return new CustomClassifier();
    }
}

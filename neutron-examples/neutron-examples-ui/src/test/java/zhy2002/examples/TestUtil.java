package zhy2002.examples;


import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.data.ValidationError;
import zhy2002.neutron.data.ValidationErrorList;

public class TestUtil {
    public static boolean hasError(ValidationErrorList validationErrorList, Class<? extends UiNodeRule<?>> ruleClass) {

        for (ValidationError aValidationErrorList : validationErrorList) {
            UiNodeRule<?> rule = aValidationErrorList.getRule();
            if (rule != null && ruleClass.isAssignableFrom(rule.getClass()))
                return true;
        }
        return false;
    }
}

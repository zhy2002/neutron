package zhy2002.neutron.core.test;


import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.data.ValidationError;
import zhy2002.neutron.core.data.ValidationErrorList;

public class TestUtil {
    public static boolean hasError(ValidationErrorList validationErrorList, Class<? extends UiNodeRule<?>> ruleClass) {

        for (ValidationError aValidationErrorList : validationErrorList) {
            UiNodeRule<?> rule = aValidationErrorList.getRule();
            if (rule != null && ruleClass.isAssignableFrom(rule.getClass()))
                return true;
        }
        return false;
    }

    public static final String BANK_B = "BankB";
}

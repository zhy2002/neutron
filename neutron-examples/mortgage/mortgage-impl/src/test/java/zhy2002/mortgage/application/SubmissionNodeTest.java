package zhy2002.mortgage.application;

import org.junit.Before;
import org.junit.Test;
import zhy2002.mortgage.application.gen.node.ApplicationNode;
import zhy2002.mortgage.application.gen.node.SubmissionNode;
import zhy2002.mortgage.interop.JavaMethods;
import zhy2002.neutron.CycleModeEnum;
import zhy2002.neutron.UiNodeContext;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule;
import zhy2002.neutron.test.TestUtil;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;


public class SubmissionNodeTest {

    private UiNodeContext<?> context;
    private ApplicationNode applicationNode;
    private SubmissionNode submissionNode;

    @Before
    public void setup() {
        applicationNode = JavaMethods.createApplicationNode(TestUtil.BANK_B, null);
        context = applicationNode.getContext();
        submissionNode = applicationNode.getSubmissionNode();
    }

    @Test
    public void inputValueShouldClearRequiredIfError() {
        submissionNode.refresh();
        assertThat(
                TestUtil.hasError(submissionNode.getBrokerFirstNameNode().getValidationErrorList(), LeafValueRequiredValidationRule.class),
                equalTo(true)
        );

        context.setCycleMode(CycleModeEnum.Debouncing);
        submissionNode.getBrokerFirstNameNode().setValue("test");
        assertThat(
                TestUtil.hasError(submissionNode.getBrokerFirstNameNode().getValidationErrorList(), LeafValueRequiredValidationRule.class),
                equalTo(true)
        );

        context.flush();
        assertThat(
                TestUtil.hasError(submissionNode.getBrokerFirstNameNode().getValidationErrorList(), LeafValueRequiredValidationRule.class),
                equalTo(false)
        );

    }

    @Test
    public void canDisableValidationForChildren() {
        submissionNode.setDisableValidation(Boolean.TRUE);
        submissionNode.getBrokerFirstNameNode().refresh();

        assertThat(submissionNode.getBrokerFirstNameNode().getValidationErrorList().size(), equalTo(0));

        submissionNode.setDisableValidation(null);
        submissionNode.getBrokerFirstNameNode().refresh();

        assertThat(submissionNode.getBrokerFirstNameNode().getValidationErrorList().size(), greaterThan(0));
    }

    @Test
    public void test() {
        System.out.println("kkk" + canSplit("544533243242354365465776876646454324324"));
    }

    private static String canSplit(String s) {
        if (s.charAt(0) != '0') {
            for (int i = 1; i <= s.length() / 2; i++) {
                String result = canSplit(s, i);
                if (result != null)
                    return result;
            }
        }
        return "No";
    }



    private static String canSplit(String s, int len) {
        String firstStr = s.substring(0, len);
        long next = Long.parseLong(firstStr) + 1;
        int startIndex = len;
        while (startIndex < s.length()) {
            String nextStr = String.valueOf(next);
            int endIndex = startIndex + nextStr.length();
            if (endIndex > s.length())
                return null;
            if (nextStr.equals(s.substring(startIndex, endIndex))) {
                startIndex = endIndex;
                next++;
            } else {
                return null;
            }
        }
        return startIndex == s.length() ? firstStr : null;
    }
}

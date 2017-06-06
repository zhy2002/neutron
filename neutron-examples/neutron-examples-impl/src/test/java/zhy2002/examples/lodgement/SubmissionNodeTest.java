package zhy2002.examples.lodgement;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.TestUtil;
import zhy2002.examples.interop.JavaMethods;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.node.SubmissionNode;
import zhy2002.neutron.CycleModeEnum;
import zhy2002.neutron.UiNodeContext;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static zhy2002.examples.TestUtil.BANK_B;


public class SubmissionNodeTest {


    private UiNodeContext<?> context;
    private ApplicationNode applicationNode;
    private SubmissionNode submissionNode;

    @Before
    public void setup() {
        applicationNode = JavaMethods.createApplicationNode(BANK_B, null);
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
}

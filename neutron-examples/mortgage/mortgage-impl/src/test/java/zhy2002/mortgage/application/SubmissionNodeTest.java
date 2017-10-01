package zhy2002.mortgage.application;

import org.junit.Before;
import org.junit.Test;
import zhy2002.mortgage.application.di.ApplicationNodeFactory;
import zhy2002.mortgage.application.gen.node.ApplicationNode;
import zhy2002.mortgage.application.gen.node.BrokerCompanyNode;
import zhy2002.mortgage.application.gen.node.SubmissionNode;
import zhy2002.neutron.core.CycleModeEnum;
import zhy2002.neutron.core.UiNodeContext;
import zhy2002.neutron.core.rule.AcceptValueLengthValidationRule;
import zhy2002.neutron.core.rule.LeafValueRequiredValidationRule;
import zhy2002.neutron.core.test.TestUtil;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class SubmissionNodeTest {

    private UiNodeContext<?> context;
    private ApplicationNode applicationNode;
    private SubmissionNode submissionNode;

    @Before
    public void setup() {
        applicationNode = ApplicationNodeFactory.create(TestUtil.BANK_B, null);
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
    public void validateBrokerCompanyLengthOnAcceptValueAction() {
        BrokerCompanyNode brokerCompanyNode = submissionNode.getBrokerCompanyNode();
        brokerCompanyNode.setValue("A");
        assertThat(brokerCompanyNode.getValidationErrorList(), hasSize(0));

        brokerCompanyNode.dispatchAcceptValueAction();
        assertThat(TestUtil.hasError(brokerCompanyNode.getValidationErrorList(), AcceptValueLengthValidationRule.class), equalTo(true));
    }

}

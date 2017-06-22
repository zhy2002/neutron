package zhy2002.examples.lodgement;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.TestUtil;
import zhy2002.examples.interop.JavaMethods;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.CycleModeEnum;
import zhy2002.neutron.UiNodeContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.sameInstance;

public class CompanyTest {

    private ApplicationNode applicationNode;
    private CompanyListNode companyListNode;

    @Before
    public void setup() {
        applicationNode = JavaMethods.createApplicationNode(TestUtil.BANK_B, null);
        companyListNode = applicationNode.getCompanyListNode();
    }

    @Test
    public void directorReferenceListShouldIncreaseByOneWhenANewPersonIsAdded() {
        CompanySelectDirectorNode selectDirectorNode = companyListNode.createItem().getCompanyGeneralNode().getCompanySelectDirectorNode();
        assertThat(selectDirectorNode.getItemCount(), equalTo(0));

        PersonNode personNode = applicationNode.getPersonListNode().createItem();
        assertThat(selectDirectorNode.getItemCount(), equalTo(1));
        RelatedPersonReferenceNode referenceNode = selectDirectorNode.getItem(0).getRelatedPersonReferenceNode();
        assertThat(referenceNode.getReferencedNode(), sameInstance(personNode));

        applicationNode.getPersonListNode().removeByIndex(0);
        assertThat(selectDirectorNode.getItemCount(), equalTo(0));

    }

    @Test
    public void newCompanyIsNotDirty() {
        applicationNode.getContext().setDirtyCheckEnabled(true);
        CompanyNode companyNode = companyListNode.createItem();
        assertThat(companyNode.getCompanyTrustNode().isDirty(), equalTo(false));
        assertThat(companyNode.isDirty(), equalTo(false));
    }

    @Test
    public void applicationNodeLabelIsSet() {
        assertThat(applicationNode.getNodeLabel(), equalTo("Bank B"));
    }

}

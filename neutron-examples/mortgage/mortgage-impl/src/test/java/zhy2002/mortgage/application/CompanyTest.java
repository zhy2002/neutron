package zhy2002.mortgage.application;

import org.eclipse.jetty.util.ArrayQueue;
import org.junit.Before;
import org.junit.Test;
import zhy2002.mortgage.application.di.ApplicationNodeFactory;
import zhy2002.mortgage.application.gen.node.*;
import zhy2002.neutron.core.test.TestUtil;

import java.util.Queue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.sameInstance;

public class CompanyTest {

    private ApplicationNode applicationNode;
    private CompanyListNode companyListNode;

    @Before
    public void setup() {
        applicationNode = ApplicationNodeFactory.create(TestUtil.BANK_B, null);
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

    @Test
    public void itemIndexIsCorrectlyMaintainedWhenItemsAreRemoved() {
        Queue<CompanyNode> queue = new ArrayQueue<>();
        for (int i = 0; i < 5; i++) {
            queue.add(companyListNode.createItem());
        }
        companyListNode.removeItem(queue.poll());
        companyListNode.removeItem(queue.poll());
        assertThat(queue.peek().getIndex(), equalTo(0));
    }
}

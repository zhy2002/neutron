package zhy2002.mortgage.application;

import org.junit.Test;
import zhy2002.mortgage.application.di.ApplicationNodeFactory;
import zhy2002.mortgage.application.gen.node.ApplicationNode;
import zhy2002.mortgage.application.gen.node.PersonListNode;
import zhy2002.mortgage.application.gen.node.PersonNode;
import zhy2002.neutron.NodeStatusEnum;
import zhy2002.neutron.data.NodeDataStore;
import zhy2002.neutron.test.TestNodeIdentity;
import zhy2002.neutron.test.TestNodeIdentityMap;
import zhy2002.neutron.test.TestUtil;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class ApplicationFactoryTest {

    @Test
    public void shouldNotThrowExceptionWhenNodeDataStoreIsNull() {
        ApplicationNode result = ApplicationNodeFactory.create(TestUtil.BANK_B, null);
        assertThat(result.getNodeStatus(), equalTo(NodeStatusEnum.Loaded));
        assertThat(result.getPersonListNode().getUniqueId(), containsString("-"));
    }

    @Test
    public void canLoadExistingContextId() {
        String testContextId = "test_context_id";
        String rootId = "root_id";

        TestNodeIdentityMap rootChildren = new TestNodeIdentityMap();
        ApplicationNode result = ApplicationNodeFactory.create(TestUtil.BANK_B, new NodeDataStore(testContextId, new TestNodeIdentity(rootId, "", rootChildren)));

        assertThat(result.getNodeStatus(), equalTo(NodeStatusEnum.Loaded));
        assertThat(result.getUniqueId(), containsString(testContextId));
        assertThat(result.getUniqueId(), containsString(rootId));
        assertThat(result.getAdditionalNode().getUniqueId(), containsString(testContextId));
        assertThat(result.getAdditionalNode().getUniqueId(), not(equalTo(result.getPersonListNode().getUniqueId())));
    }

    @Test
    public void objectUiNodeChildrenCanLoadId() {

        String testContextId = "test_context_id";
        String rootId = "root_id";

        TestNodeIdentityMap additionalNodeChildren = new TestNodeIdentityMap();
        TestNodeIdentity additionalCommentIdentity = new TestNodeIdentity("additionalCommentNodeId", "additionalCommentNode", null);
        additionalNodeChildren.add(additionalCommentIdentity);

        TestNodeIdentityMap rootChildren = new TestNodeIdentityMap();
        rootChildren.add(new TestNodeIdentity("idNodeId", "idNode", null));
        rootChildren.add(new TestNodeIdentity("statusNodeId", "statusNode", null));
        rootChildren.add(new TestNodeIdentity("personListNodeId", "personListNode", null));
        rootChildren.add(new TestNodeIdentity("additionalNodeId", "additionalNode", additionalNodeChildren));

        ApplicationNode result = ApplicationNodeFactory.create(TestUtil.BANK_B, new NodeDataStore(testContextId, new TestNodeIdentity(rootId, "", rootChildren)));

        assertThat(result.getIdNode().getUniqueId(), containsString(rootChildren.get("idNode").getLocalId()));
        assertThat(result.getStatusNode().getUniqueId(), containsString(rootChildren.get("statusNode").getLocalId()));
        assertThat(result.getPersonListNode().getUniqueId(), containsString(rootChildren.get("personListNode").getLocalId()));

        assertThat(result.getAdditionalNode().getAdditionalCommentNode().getUniqueId(), containsString(testContextId));
        assertThat(result.getAdditionalNode().getAdditionalCommentNode().getUniqueId(), containsString(additionalCommentIdentity.getLocalId()));

    }

    @Test
    public void listUiNodeItemsCanBeCreatedOnLoad() {
        String testContextId = "test_context_id";
        String rootId = "root_id";

        TestNodeIdentityMap personListChildren = new TestNodeIdentityMap();
        TestNodeIdentity person1Identity = new TestNodeIdentity("person1-id", "1", null);
        personListChildren.add(person1Identity);
        TestNodeIdentity person2Identity = new TestNodeIdentity("person3-id", "3", null);
        personListChildren.add(person2Identity);

        TestNodeIdentityMap rootChildren = new TestNodeIdentityMap();
        rootChildren.add(new TestNodeIdentity("personListNodeId", "personListNode", personListChildren));

        ApplicationNode result = ApplicationNodeFactory.create(TestUtil.BANK_B, new NodeDataStore(testContextId, new TestNodeIdentity(rootId, "", rootChildren)));

        PersonListNode personListNode = result.getPersonListNode();
        assertThat(personListNode.getItemCount(), equalTo(2));
        assertThat(personListNode.getItem(0).getUniqueId(), containsString(person1Identity.getLocalId()));
        assertThat(personListNode.getItem(1).getUniqueId(), containsString(person2Identity.getLocalId()));

        PersonNode personNode = personListNode.createItem();
        assertThat(personNode.getName(), equalTo("4"));
    }

}

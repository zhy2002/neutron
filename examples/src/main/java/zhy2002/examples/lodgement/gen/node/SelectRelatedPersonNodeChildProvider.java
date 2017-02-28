package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface SelectRelatedPersonNodeChildFactory {
    RelatedPersonReferenceNode createRelatedPersonReferenceNode();
    SelectRelatedPersonFlagNode createSelectRelatedPersonFlagNode();
}

@Singleton
public class SelectRelatedPersonNodeChildProvider {
    @Inject
    MembersInjector<RelatedPersonReferenceNode> relatedPersonReferenceNodeInjector;
    @Inject
    MembersInjector<SelectRelatedPersonFlagNode> selectRelatedPersonFlagNodeInjector;

    @Inject
    protected SelectRelatedPersonNodeChildProvider () {}

    protected MembersInjector<RelatedPersonReferenceNode> getRelatedPersonReferenceNodeInjector() {
        return this.relatedPersonReferenceNodeInjector;
    }

    protected MembersInjector<SelectRelatedPersonFlagNode> getSelectRelatedPersonFlagNodeInjector() {
        return this.selectRelatedPersonFlagNodeInjector;
    }

    protected RelatedPersonReferenceNode newRelatedPersonReferenceNode(
        SelectRelatedPersonNode parent,
        String name
    ) {
        return new RelatedPersonReferenceNode(parent, name);
    }

    protected void configureRelatedPersonReferenceNode(RelatedPersonReferenceNode node) {
    }

    protected SelectRelatedPersonFlagNode newSelectRelatedPersonFlagNode(
        SelectRelatedPersonNode parent,
        String name
    ) {
        return new SelectRelatedPersonFlagNode(parent, name);
    }

    protected void configureSelectRelatedPersonFlagNode(SelectRelatedPersonFlagNode node) {
    }

    SelectRelatedPersonNodeChildFactory createFactory(SelectRelatedPersonNode parent) {
        return new SelectRelatedPersonNodeChildFactoryImpl(parent);
    }

    private class SelectRelatedPersonNodeChildFactoryImpl implements SelectRelatedPersonNodeChildFactory {

        private final SelectRelatedPersonNode parent;
        
        private SelectRelatedPersonNodeChildFactoryImpl(SelectRelatedPersonNode parent) {
            this.parent = parent;
        }

        @Override
        public RelatedPersonReferenceNode createRelatedPersonReferenceNode() {
            RelatedPersonReferenceNode node = newRelatedPersonReferenceNode(parent, "relatedPersonReferenceNode");
            relatedPersonReferenceNodeInjector.injectMembers(node);
            configureRelatedPersonReferenceNode(node);
            return node;
        }

        @Override
        public SelectRelatedPersonFlagNode createSelectRelatedPersonFlagNode() {
            SelectRelatedPersonFlagNode node = newSelectRelatedPersonFlagNode(parent, "selectRelatedPersonFlagNode");
            selectRelatedPersonFlagNodeInjector.injectMembers(node);
            configureSelectRelatedPersonFlagNode(node);
            return node;
        }

    }
}

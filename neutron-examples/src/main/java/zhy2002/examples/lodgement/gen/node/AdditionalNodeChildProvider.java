package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface AdditionalNodeChildFactory {
    AdditionalCommentNode createAdditionalCommentNode();
    RelatedPartyListNode createRelatedPartyListNode();
}

@Singleton
public class AdditionalNodeChildProvider {
    @Inject
    MembersInjector<RelatedPartyListNode> relatedPartyListNodeInjector;
    @Inject
    MembersInjector<AdditionalCommentNode> additionalCommentNodeInjector;

    @Inject
    protected AdditionalNodeChildProvider () {}

    protected MembersInjector<RelatedPartyListNode> getRelatedPartyListNodeInjector() {
        return this.relatedPartyListNodeInjector;
    }

    protected MembersInjector<AdditionalCommentNode> getAdditionalCommentNodeInjector() {
        return this.additionalCommentNodeInjector;
    }

    protected AdditionalCommentNode newAdditionalCommentNode(
        AdditionalNode parent,
        String name
    ) {
        return new AdditionalCommentNode(parent, name);
    }

    protected void configureAdditionalCommentNode(AdditionalCommentNode node) {
    }

    protected RelatedPartyListNode newRelatedPartyListNode(
        AdditionalNode parent,
        String name
    ) {
        return new RelatedPartyListNode(parent, name);
    }

    protected void configureRelatedPartyListNode(RelatedPartyListNode node) {
    }

    AdditionalNodeChildFactory createFactory(AdditionalNode parent) {
        return new AdditionalNodeChildFactoryImpl(parent);
    }

    private class AdditionalNodeChildFactoryImpl implements AdditionalNodeChildFactory {

        private final AdditionalNode parent;
        
        private AdditionalNodeChildFactoryImpl(AdditionalNode parent) {
            this.parent = parent;
        }

        @Override
        public AdditionalCommentNode createAdditionalCommentNode() {
            AdditionalCommentNode node = newAdditionalCommentNode(parent, "additionalCommentNode");
            additionalCommentNodeInjector.injectMembers(node);
            configureAdditionalCommentNode(node);
            return node;
        }

        @Override
        public RelatedPartyListNode createRelatedPartyListNode() {
            RelatedPartyListNode node = newRelatedPartyListNode(parent, "relatedPartyListNode");
            relatedPartyListNodeInjector.injectMembers(node);
            configureRelatedPartyListNode(node);
            return node;
        }

    }
}

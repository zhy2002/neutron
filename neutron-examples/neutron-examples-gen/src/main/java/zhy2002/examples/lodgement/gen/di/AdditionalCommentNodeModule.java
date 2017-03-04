package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AdditionalCommentNodeModule {

    private final AdditionalCommentNode owner;

    public AdditionalCommentNodeModule(AdditionalCommentNode owner) {
        this.owner = owner;
    }

    @Provides @AdditionalCommentNodeScope @Owner AdditionalCommentNode provideAdditionalCommentNode() {
        return owner;
    }

    @Provides @AdditionalCommentNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @AdditionalCommentNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AdditionalCommentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AdditionalCommentNodeScope AdditionalNode provideAdditionalNode() {
        return owner.getParent();
    }

}
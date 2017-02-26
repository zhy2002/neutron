package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PostcodeNodeModule {

    private final PostcodeNode owner;

    public PostcodeNodeModule(PostcodeNode owner) {
        this.owner = owner;
    }

    @Provides @PostcodeNodeScope @Owner PostcodeNode providePostcodeNode() {
        return owner;
    }

    @Provides @PostcodeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PostcodeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PostcodeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}
package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class TitleNodeModule {

    private final TitleNode owner;

    public TitleNodeModule(TitleNode owner) {
        this.owner = owner;
    }

    @Provides @TitleNodeScope @Owner TitleNode provideTitleNode() {
        return owner;
    }

    @Provides @TitleNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @TitleNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @TitleNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}
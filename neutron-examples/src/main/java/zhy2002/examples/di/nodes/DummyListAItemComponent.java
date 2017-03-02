package zhy2002.examples.di.nodes;


import dagger.Subcomponent;

@DummyListAItemScope
@Subcomponent(modules = {DummyListAItemModule.class})
public interface DummyListAItemComponent {

    DummyListAItemNode provideDummyListAItemNode();

    DummyListAItemGuide provideDummyListAItemGuide();

    @Subcomponent.Builder
    interface Builder {

        Builder dummyListAItemModule(DummyListAItemModule module);

        DummyListAItemComponent build();
    }
}

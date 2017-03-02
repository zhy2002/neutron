package zhy2002.examples.di.nodes;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DummyListANode_MembersInjector implements MembersInjector<DummyListANode> {
  private final Provider<DummyListAItemComponent.Builder> itemComponentBuilderProvider;

  public DummyListANode_MembersInjector(
      Provider<DummyListAItemComponent.Builder> itemComponentBuilderProvider) {
    assert itemComponentBuilderProvider != null;
    this.itemComponentBuilderProvider = itemComponentBuilderProvider;
  }

  public static MembersInjector<DummyListANode> create(
      Provider<DummyListAItemComponent.Builder> itemComponentBuilderProvider) {
    return new DummyListANode_MembersInjector(itemComponentBuilderProvider);
  }

  @Override
  public void injectMembers(DummyListANode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.itemComponentBuilderProvider = itemComponentBuilderProvider;
  }

  public static void injectItemComponentBuilderProvider(
      DummyListANode instance,
      Provider<DummyListAItemComponent.Builder> itemComponentBuilderProvider) {
    instance.itemComponentBuilderProvider = itemComponentBuilderProvider;
  }
}

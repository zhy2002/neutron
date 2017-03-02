package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CurrentEmploymentListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CurrentEmploymentListNode_MembersInjector
    implements MembersInjector<CurrentEmploymentListNode> {
  private final Provider<CurrentEmploymentListNodeItemProvider> providerProvider;

  private final Provider<CurrentEmploymentListNodeComponent.Builder> builderProvider;

  public CurrentEmploymentListNode_MembersInjector(
      Provider<CurrentEmploymentListNodeItemProvider> providerProvider,
      Provider<CurrentEmploymentListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CurrentEmploymentListNode> create(
      Provider<CurrentEmploymentListNodeItemProvider> providerProvider,
      Provider<CurrentEmploymentListNodeComponent.Builder> builderProvider) {
    return new CurrentEmploymentListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(CurrentEmploymentListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      CurrentEmploymentListNode instance,
      Provider<CurrentEmploymentListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      CurrentEmploymentListNode instance,
      Provider<CurrentEmploymentListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

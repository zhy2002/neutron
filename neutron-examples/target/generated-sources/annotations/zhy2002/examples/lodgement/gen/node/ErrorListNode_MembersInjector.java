package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ErrorListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ErrorListNode_MembersInjector implements MembersInjector<ErrorListNode> {
  private final Provider<ErrorListNodeItemProvider> providerProvider;

  private final Provider<ErrorListNodeComponent.Builder> builderProvider;

  public ErrorListNode_MembersInjector(
      Provider<ErrorListNodeItemProvider> providerProvider,
      Provider<ErrorListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ErrorListNode> create(
      Provider<ErrorListNodeItemProvider> providerProvider,
      Provider<ErrorListNodeComponent.Builder> builderProvider) {
    return new ErrorListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(ErrorListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      ErrorListNode instance, Provider<ErrorListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      ErrorListNode instance, Provider<ErrorListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

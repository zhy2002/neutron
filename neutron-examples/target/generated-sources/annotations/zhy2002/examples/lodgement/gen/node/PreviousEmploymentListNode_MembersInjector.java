package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PreviousEmploymentListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PreviousEmploymentListNode_MembersInjector
    implements MembersInjector<PreviousEmploymentListNode> {
  private final Provider<PreviousEmploymentListNodeItemProvider> providerProvider;

  private final Provider<PreviousEmploymentListNodeComponent.Builder> builderProvider;

  public PreviousEmploymentListNode_MembersInjector(
      Provider<PreviousEmploymentListNodeItemProvider> providerProvider,
      Provider<PreviousEmploymentListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PreviousEmploymentListNode> create(
      Provider<PreviousEmploymentListNodeItemProvider> providerProvider,
      Provider<PreviousEmploymentListNodeComponent.Builder> builderProvider) {
    return new PreviousEmploymentListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(PreviousEmploymentListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      PreviousEmploymentListNode instance,
      Provider<PreviousEmploymentListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      PreviousEmploymentListNode instance,
      Provider<PreviousEmploymentListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

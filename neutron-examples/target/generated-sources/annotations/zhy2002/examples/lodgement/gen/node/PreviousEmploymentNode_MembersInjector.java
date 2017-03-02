package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PreviousEmploymentNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PreviousEmploymentNode_MembersInjector
    implements MembersInjector<PreviousEmploymentNode> {
  private final Provider<EmploymentNodeChildProvider> providerProvider;

  private final Provider<PreviousEmploymentNodeComponent.Builder> builderProvider;

  public PreviousEmploymentNode_MembersInjector(
      Provider<EmploymentNodeChildProvider> providerProvider,
      Provider<PreviousEmploymentNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PreviousEmploymentNode> create(
      Provider<EmploymentNodeChildProvider> providerProvider,
      Provider<PreviousEmploymentNodeComponent.Builder> builderProvider) {
    return new PreviousEmploymentNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(PreviousEmploymentNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((EmploymentNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PreviousEmploymentNode instance,
      Provider<PreviousEmploymentNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

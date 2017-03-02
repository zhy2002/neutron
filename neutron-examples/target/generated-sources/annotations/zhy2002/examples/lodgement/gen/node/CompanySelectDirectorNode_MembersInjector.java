package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanySelectDirectorNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanySelectDirectorNode_MembersInjector
    implements MembersInjector<CompanySelectDirectorNode> {
  private final Provider<SelectRelatedPersonListNodeItemProvider> providerProvider;

  private final Provider<CompanySelectDirectorNodeComponent.Builder> builderProvider;

  public CompanySelectDirectorNode_MembersInjector(
      Provider<SelectRelatedPersonListNodeItemProvider> providerProvider,
      Provider<CompanySelectDirectorNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanySelectDirectorNode> create(
      Provider<SelectRelatedPersonListNodeItemProvider> providerProvider,
      Provider<CompanySelectDirectorNodeComponent.Builder> builderProvider) {
    return new CompanySelectDirectorNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(CompanySelectDirectorNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((SelectRelatedPersonListNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanySelectDirectorNode instance,
      Provider<CompanySelectDirectorNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

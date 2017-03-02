package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SelectAccountHolderFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectAccountHolderFlagNode_MembersInjector
    implements MembersInjector<SelectAccountHolderFlagNode> {
  private final Provider<SelectAccountHolderFlagNodeComponent.Builder> builderProvider;

  public SelectAccountHolderFlagNode_MembersInjector(
      Provider<SelectAccountHolderFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SelectAccountHolderFlagNode> create(
      Provider<SelectAccountHolderFlagNodeComponent.Builder> builderProvider) {
    return new SelectAccountHolderFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(SelectAccountHolderFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      SelectAccountHolderFlagNode instance,
      Provider<SelectAccountHolderFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

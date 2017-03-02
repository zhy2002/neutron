package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MortgageLoanTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLoanTypeNode_MembersInjector
    implements MembersInjector<MortgageLoanTypeNode> {
  private final Provider<MortgageLoanTypeNodeComponent.Builder> builderProvider;

  public MortgageLoanTypeNode_MembersInjector(
      Provider<MortgageLoanTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MortgageLoanTypeNode> create(
      Provider<MortgageLoanTypeNodeComponent.Builder> builderProvider) {
    return new MortgageLoanTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(MortgageLoanTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MortgageLoanTypeNode instance,
      Provider<MortgageLoanTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

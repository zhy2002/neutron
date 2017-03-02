package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MortgageLoanTermExpiryDateNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLoanTermExpiryDateNode_MembersInjector
    implements MembersInjector<MortgageLoanTermExpiryDateNode> {
  private final Provider<MortgageLoanTermExpiryDateNodeComponent.Builder> builderProvider;

  public MortgageLoanTermExpiryDateNode_MembersInjector(
      Provider<MortgageLoanTermExpiryDateNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MortgageLoanTermExpiryDateNode> create(
      Provider<MortgageLoanTermExpiryDateNodeComponent.Builder> builderProvider) {
    return new MortgageLoanTermExpiryDateNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(MortgageLoanTermExpiryDateNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MortgageLoanTermExpiryDateNode instance,
      Provider<MortgageLoanTermExpiryDateNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

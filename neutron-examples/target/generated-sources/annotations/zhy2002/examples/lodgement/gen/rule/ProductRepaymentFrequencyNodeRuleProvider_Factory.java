package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRepaymentFrequencyNodeRuleProvider_Factory
    implements Factory<ProductRepaymentFrequencyNodeRuleProvider> {
  private final MembersInjector<ProductRepaymentFrequencyNodeRuleProvider>
      productRepaymentFrequencyNodeRuleProviderMembersInjector;

  public ProductRepaymentFrequencyNodeRuleProvider_Factory(
      MembersInjector<ProductRepaymentFrequencyNodeRuleProvider>
          productRepaymentFrequencyNodeRuleProviderMembersInjector) {
    assert productRepaymentFrequencyNodeRuleProviderMembersInjector != null;
    this.productRepaymentFrequencyNodeRuleProviderMembersInjector =
        productRepaymentFrequencyNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductRepaymentFrequencyNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productRepaymentFrequencyNodeRuleProviderMembersInjector,
        new ProductRepaymentFrequencyNodeRuleProvider());
  }

  public static Factory<ProductRepaymentFrequencyNodeRuleProvider> create(
      MembersInjector<ProductRepaymentFrequencyNodeRuleProvider>
          productRepaymentFrequencyNodeRuleProviderMembersInjector) {
    return new ProductRepaymentFrequencyNodeRuleProvider_Factory(
        productRepaymentFrequencyNodeRuleProviderMembersInjector);
  }
}

package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardListNodeItemProvider_MembersInjector
    implements MembersInjector<CreditCardListNodeItemProvider> {
  private final MembersInjector<CreditCardNode> creditCardNodeInjectorMembersInjector;

  public CreditCardListNodeItemProvider_MembersInjector(
      MembersInjector<CreditCardNode> creditCardNodeInjectorMembersInjector) {
    assert creditCardNodeInjectorMembersInjector != null;
    this.creditCardNodeInjectorMembersInjector = creditCardNodeInjectorMembersInjector;
  }

  public static MembersInjector<CreditCardListNodeItemProvider> create(
      MembersInjector<CreditCardNode> creditCardNodeInjectorMembersInjector) {
    return new CreditCardListNodeItemProvider_MembersInjector(
        creditCardNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(CreditCardListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.creditCardNodeInjector = creditCardNodeInjectorMembersInjector;
  }

  public static void injectCreditCardNodeInjector(
      CreditCardListNodeItemProvider instance,
      MembersInjector<CreditCardNode> creditCardNodeInjector) {
    instance.creditCardNodeInjector = creditCardNodeInjector;
  }
}

package example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;

public class MockitoTests {
    @Test
    void shouldCallPaymentGatewayOnce() {
        // Arrange – Create mock dependency
        PaymentGateway gateway = mock(PaymentGateway.class);
        PaymentService service = new PaymentService(gateway);

        // Act – Invoke the method under test
        service.makePayment(100.0);

        // Assert – Verify interaction
        verify(gateway, times(1)).process(100.0);

    }
}

package africa.semicolon.cheetah.data.repositories;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import africa.semicolon.cheetah.data.models.Package;
import static org.junit.jupiter.api.Assertions.*;

class PackageRepositoryImplTest {
    private PackageRepository packageRepository;

    @BeforeEach
    void setUp() {
        packageRepository = new PackageRepositoryImpl();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void saveNewPackageTest() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping Mat");
        aPackage.setSenderName("Jerry");
        aPackage.setReceiverName("Dammy");
        aPackage.setReceiverPhone("0123456789");
        aPackage.setDeliveryAddress("312, Herbert Macaulay Way, Sabo-Yaba, Lagos");
        aPackage.setNetWeight(23.5);
        aPackage.setSenderPhone(aPackage.getReceiverPhone());

        Package savedPackage = packageRepository.save(aPackage);
        assertEquals(1, savedPackage.getTrackingNumber());
    }

    @Test
    void findAll() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteByTrackingNumber() {
    }

    @Test
    void findPackageByTrackingNumber() {
    }
}
package furamaresort.services;

import java.io.IOException;

public interface IBookingService extends IService {
void creatContracts() throws IOException;
void displayContracts() throws IOException;
void editContracts();
}

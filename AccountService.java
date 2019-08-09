//package com.aexp.esi.esiapi;
//
//import com.aexp.esi.esiapi.dao.AccountRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;
//import java.awt.print.Pageable;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class AccountService {
//
//    //create repository in controller, instance property for controller class, dependency injection to inject instance of this interface
//    @Autowired
//    private AccountRepository accountRepository; //now we can call repository interface
//
//    public List<OracleMapping> getAllByDbStatusCD(String dbStatusCD){
//        return accountRepository.getAllByDbStatusCD(dbStatusCD);
//    }
//
//}
//








///////////////////////////////////////////////
////////////CODE NOT IN USE////////////////////
////////////CODE NOT IN USE////////////////////
////////////CODE NOT IN USE////////////////////
///////////////////////////////////////////////

//     class StCode {
//            private String code;
//
//            public StCode(String StCode) {
//                this.code = code;
//            }
//            public final String getStCode() {
//                return code;
//            }
//        }
//      String balance = "test";
//    String printing = "";
//    ObjectMapper mapper = new ObjectMapper();
//    String testCSV = "C:/Users/macuen/Desktop/ESI/Testing/AccountNumbers.csv"; //access testing file
//    BufferedReader br = null; //initializing buffer reader
//    String line = ""; //formatting for file
//    String CSVsplit = ","; //formatting for file
//    int CSVRows = 0; //to find number of rows in testing file
//
//        try {
//                br = new BufferedReader(new FileReader(testCSV)); //to read from file
//                while ((line = br.readLine()) != null) { //while next entry
//                CSVRows++;
//                // use comma as separator
//                String[] accNumList = line.split(CSVsplit); //split array
//                String accNumListSub = accNumList[0];
//
//                if (scode.equals(accNumListSub)) {
//                balance = accNumList[1];
//                }
//                }
//                } catch (IOException e) {
//                e.printStackTrace();
//                } finally {
//                if (br != null) {
//                try {
//                br.close();
//                } catch (IOException e) {
//                e.printStackTrace();
//                }
//                }
//                }
//                //adding account number and balance to new account class
//                StCode code = new StCode(scode, balance);
//                //allows for printing in JSON format with mapper object
//                try {
//                printing = ((ObjectMapper) mapper).writerWithDefaultPrettyPrinter().writeValueAsString(code);
//                } catch (JsonMappingException e) {
//                e.printStackTrace();
//                } catch (JsonGenerationException e) {
//                e.printStackTrace();
//                } catch (IOException e) {
//                e.printStackTrace();
//                }

//    public List<OracleMapping> findAllByStatusCD(String dbStatusCD, PageRequest pageRequest){
//        return accountRepository.findAllByDbStatusCD(dbStatusCD, PageRequest.of(0,20));
//    }
//    public List<OracleMapping> getAllByDbStatusCDIs(String dbStatusCD, PageRequest pageRequest){
//        return accountRepository.getAllByDbStatusCDIs(dbStatusCD, PageRequest.of(4,20));
//    }
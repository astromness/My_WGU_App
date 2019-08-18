package Database.DataAccessObjects;

import Models.Term;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TermDAO {

    @Query("Select * from terms where id = :id")
    Term getTermById(int id);

    @Query("Select * from terms where term_number = :term and student = :student_id")
    Term getTermByStudentTerm(int term,int student_id);

    @Query("Select * from terms where student = :student_id and status != 'C'")
    List<Term> getIncompleteTerms(String student_id);

    @Query("Select * from terms where student = :student_id and status = 'C'")
    List<Term> getCompletedTerms(String student_id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTerm(Term term);

}

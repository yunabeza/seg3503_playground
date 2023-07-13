defmodule Grades do

 defmodule Calculator do
    def percentage_grade(notes) do
      homeworkmarks = sum_string_values(notes[:homework])
      labmarks = sum_string_values(notes[:labs])
      midterm = String.to_integer(notes[:midterm])
      final = String.to_integer(notes[:final])

      homework_qty = length(notes[:homework])
      labs_qty = length(notes[:labs])

      total = (homeworkmarks / homework_qty) * 0.15 + (labmarks / labs_qty) * 0.3 + midterm * 0.25 + final * 0.3
      total
    end

    defp sum_string_values(m) do
      Enum.reduce(m, 0, fn n, acc -> acc + String.to_integer(n) end)
    end

    def letter_grade(notes) do
      pts = percentage_grade(notes)

      case pts do
        _ when pts >= 90 -> "A+"
        _ when pts >= 85 -> "A"
        _ when pts >= 80 -> "A-"
        _ when pts >= 75 -> "B+"
        _ when pts >= 70 -> "B"
        _ when pts >= 65 -> "B-"
        _ when pts >= 60 -> "C+"
        _ when pts >= 55 -> "C"
        _ when pts >= 50 -> "C-"
        _ when pts >= 45 -> "D+"
        _ when pts >= 40 -> "D"
        _ when pts >= 35 -> "D-"
        _ -> "F"
      end
    end

    def numeric_grade(notes) do
      pts = percentage_grade(notes)

      case pts do
        _ when pts >= 90 -> "10"
        _ when pts >= 85 -> "9"
        _ when pts >= 80 -> "8.5"
        _ when pts >= 75 -> "8"
        _ when pts >= 70 -> "7.5"
        _ when pts >= 65 -> "7"
        _ when pts >= 60 -> "6.5"
        _ when pts >= 55 -> "6"
        _ when pts >= 50 -> "5.5"
        _ when pts >= 45 -> "5"
        _ when pts >= 40 -> "4.5"
        _ when pts >= 35 -> "4"
        _ when pts >= 30 -> "3.5"
        _ when pts >= 25 -> "3"
        _ when pts >= 20 -> "2.5"
        _ when pts >= 15 -> "2"
        _ when pts >= 10 -> "1.5"
        _ when pts >= 5 -> "1"
        _ when pts > 0 -> "0.5"
        _ -> "0"
      end
    end
  end
end
